package testingWithSDA.service;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;
import testingWithSDA.entity.EmailAddress;
import testingWithSDA.entity.Person;
import testingWithSDA.entity.PeselNumber;
import testingWithSDA.service.IdentificationService;
import testingWithSDA.service.PersonService;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

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

	@Test
	void testFormatPerson() {
		// given
		final Person person = new Person(1, "John", "Smith", new EmailAddress("abc@ww"), new PeselNumber("12345678901"));

		// when
		final String result = PersonService.formatPerson(person);

		// then
		assertThat(result).isEqualTo("#1. John Smith, 12345678901 (abc@ww)");
	}

	@Test
	void testNextAvailableId() {
		// given
		final pl.sdacademy.testing.service.IdentificationService identificationService = new pl.sdacademy.testing.service.IdentificationService();
		final pl.sdacademy.testing.service.PersonService personService = new pl.sdacademy.testing.service.PersonService(identificationService);

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
		final Person person = personService.createPerson("John", "Smith", "abc", "123");

		// then
		assertThat(person)
				.isEqualTo(new Person(0, "John", "Smith", new EmailAddress("abc"), new PeselNumber("123")));
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
		personService.addPerson(new Person(2, "Abc", "Xyz", new EmailAddress("x@y.z"), new PeselNumber("123412341234")));

		// when
		final double result = personService.percent(person -> person.lastName().equals("Abc"));

		// then
		assertThat(result).isCloseTo(50, Offset.offset(0.00001));
	}
}
