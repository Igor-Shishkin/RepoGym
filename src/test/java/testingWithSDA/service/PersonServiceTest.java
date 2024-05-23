package testingWithSDA.service;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;
import sda.testingWithSDA.entity.EmailAddress;
import sda.testingWithSDA.entity.Person;
import sda.testingWithSDA.entity.PeselNumber;
import sda.testingWithSDA.service.IdentificationService;
import sda.testingWithSDA.service.PersonService;

import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;


import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class PersonServiceTest {
	@Test
	void testGetPeopleEmptyList() {
		// given
		final IdentificationService identificationService = new IdentificationService();
		final PersonService personService = new PersonService(identificationService);

		// when
		final List<Person> people = personService.getPeople();

		// then
		assertThat(people).isEmpty();
	}

	@Test
	void testGetPeopleNonEmptyList() {
		// given
		final IdentificationService identificationService = new IdentificationService();
		final PersonService personService = new PersonService(identificationService);
		final Person person1 = new Person(1, "John", "Smith", new EmailAddress("a@bc"), new PeselNumber("12345678901"));
		final Person person2 = new Person(2, "Tom", "Smith", new EmailAddress("x@yz"), new PeselNumber("12341234123"));
		personService.addPerson(person1);
		personService.addPerson(person2);

		// when
		final List<Person> people = personService.getPeople();

		// then
		assertThat(people).containsExactlyInAnyOrder(person2, person1);
	}

	@ParameterizedTest
	@ArgumentsSource(MyProvider.class)
	void testFormatPerson(final Person person, final String expected) {
		// when
		final String result = PersonService.formatPerson(person);

		// then
		assertThat(result).isEqualTo(expected);
	}

	@Test
	void testNextAvailableId() {
		// given
		final IdentificationService identificationService = new IdentificationService();
		final PersonService personService = new PersonService(identificationService);

		// when
		final int result = personService.getNextAvailableId();

		// then
		assertThat(result).isZero();
	}

	@Test
	void testCreatePerson() {
		// given
		final IdentificationService identificationService = new IdentificationService();
		final PersonService personService = new PersonService(identificationService);

		// when
		final Person person = personService.createPerson("John", "Smith", "abc@ww.ww", "12345678901");

		// then
		assertThat(person)
				.isEqualTo(new Person(0, "John", "Smith", new EmailAddress("abc@ww.ww"), new PeselNumber("12345678901")));
	}

	@Test
	void testGetPersonByIdNotNull() {
		// given
		final PersonService personService = new PersonService(null);
		final Person person = new Person(1, "John", "Smith", new EmailAddress("a@a.a"), new PeselNumber("12345678901"));
		personService.addPerson(person);

		// when
		final Person result = personService.getPerson(1);

		// then
		assertThat(result).isSameAs(person);
	}

	@Test
	void testGetPersonByIdNull() {
		// given
		final PersonService personService = new PersonService(null);

		// when
		final Person result = personService.getPerson(1);

		// then
		assertThat(result).isNull();
	}

	@Test
	void testGetPersonByPeselNumberNotNull() {
		// given
		final PersonService personService = new PersonService(null);
		final Person person = new Person(1, "John", "Smith", new EmailAddress("a@a.a"), new PeselNumber("12345678901"));
		personService.addPerson(person);

		// when
		final Person result = personService.getPerson(new PeselNumber("12345678901"));

		// then
		assertThat(result).isSameAs(person);
	}

	@Test
	void testGetPersonByPeselNumberNull() {
		// given
		final PersonService personService = new PersonService(null);

		// when
		final Person result = personService.getPerson(new PeselNumber("12345678901"));

		// then
		assertThat(result).isNull();
	}

	@Test
	void testGetPersonByEmailAddressNotNull() {
		// given
		final PersonService personService = new PersonService(null);
		final Person person = new Person(1, "John", "Smith", new EmailAddress("a@a.a"), new PeselNumber("12345678901"));
		personService.addPerson(person);

		// when
		final Person result = personService.getPerson(new EmailAddress("a@a.a"));

		// then
		assertThat(result).isSameAs(person);
	}

	@Test
	void testGetPersonByEmailAddressNull() {
		// given
		final PersonService personService = new PersonService(null);

		// when
		final Person result = personService.getPerson(new EmailAddress("a@a.a"));

		// then
		assertThat(result).isNull();
	}

	@Test
	void testPercentage() {
		// given
		final PersonService personService = new PersonService(null);
		personService.addPerson(new Person(1, "Abc", "Abc", new EmailAddress("a@a.a"), new PeselNumber("12345678901")));
		personService.addPerson(new Person(2, "Abc", "Xyz", new EmailAddress("x@y.z"), new PeselNumber("12341234123")));

		// when
		final double result = personService.percent(person -> person.lastName().equals("Abc"));

		// then
		assertThat(result).isCloseTo(50, Offset.offset(0.00001));
	}

	@Test
	void addPersonWithSameId() {
		// given
		final PersonService personService = new PersonService(null);
		final Person person1 = new Person(1, "John", "Smith", new EmailAddress("abc@pp.pl"), new PeselNumber("12341234123"));
		final Person person2 = new Person(1, "Tom", "Smithy", new EmailAddress("a@pppp.pl"), new PeselNumber("12345678901"));
		personService.addPerson(person1);

		// when
		final ThrowableAssert.ThrowingCallable callable = () -> personService.addPerson(person2);

		// then
		assertThatThrownBy(callable)
				.isInstanceOf(IllegalArgumentException.class)
				.hasMessage("Person with this id already exists!");
	}

	@Test
	void addPersonWithSameEmailAddress() {
		// given
		final PersonService personService = new PersonService(null);
		final Person person1 = new Person(1, "John", "Smith", new EmailAddress("abc@pp.pl"), new PeselNumber("12341234123"));
		final Person person2 = new Person(2, "Tom", "Smithy", new EmailAddress("abc@pp.pl"), new PeselNumber("12345678901"));
		personService.addPerson(person1);

		// when
		final ThrowableAssert.ThrowingCallable callable = () -> personService.addPerson(person2);

		// then
		assertThatThrownBy(callable)
				.isInstanceOf(IllegalArgumentException.class)
				.hasMessage("Person with this email address already exists!");
	}

	@Test
	void addPersonWithSamePeselNumber() {
		// given
		final PersonService personService = new PersonService(null);
		final Person person1 = new Person(1, "John", "Smith", new EmailAddress("abc@pp.pl"), new PeselNumber("12341234123"));
		final Person person2 = new Person(2, "Tom", "Smithy", new EmailAddress("aaa@pp.pl"), new PeselNumber("12341234123"));
		personService.addPerson(person1);

		// when
		final ThrowableAssert.ThrowingCallable callable = () -> personService.addPerson(person2);

		// then
		assertThatThrownBy(callable)
				.isInstanceOf(IllegalArgumentException.class)
				.hasMessage("Person with this pesel number already exists!");
	}

	@Test
	void addAnotherPerson() {
		// given
		final PersonService personService = new PersonService(null);
		final Person person1 = new Person(1, "John", "Smith", new EmailAddress("abc@pp.pl"), new PeselNumber("12341234123"));
		final Person person2 = new Person(2, "Tom", "Smithy", new EmailAddress("aaa@pp.pl"), new PeselNumber("12345678901"));
		personService.addPerson(person1);

		// when
		personService.addPerson(person2);

		// then
		final List<Person> people = personService.getPeople();
		assertThat(people).containsExactlyInAnyOrder(person1, person2);
	}

	private static class MyProvider implements ArgumentsProvider {
		@Override
		public Stream<? extends Arguments> provideArguments(final ExtensionContext extensionContext) {
			return Stream.of(
					Arguments.of(
							new Person(1, "John", "Smith", new EmailAddress("abc@ww.pl"), new PeselNumber("12341234123")),
							"#1. John Smith, 12341234123 (abc@ww.pl)"),
					Arguments.of(
							new Person(2, "Tom", "Smithy", new EmailAddress("aaa@xy.zz"), new PeselNumber("12345678901")),
							"#2. Tom Smithy, 12345678901 (aaa@xy.zz)"));
		}
	}
}
