package testingWithSDA.service;

import testingWithSDA.entity.EmailAddress;
import testingWithSDA.entity.Person;
import testingWithSDA.entity.PeselNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PersonService {
	private final List<Person> list = new ArrayList<>();
	private final IdentificationService identificationService;

	public PersonService(final IdentificationService identificationService) {
		this.identificationService = identificationService;
	}

	public List<Person> getPeople() {
		return list;
	}

	public int getNextAvailableId() {
		return identificationService.next();
	}

	public Person createPerson(final String firstName, final String lastName, final String emailAddress, final String peselNumber) {
		return new Person(getNextAvailableId(), firstName, lastName, new EmailAddress(emailAddress), new PeselNumber(peselNumber));
	}

	public void addPerson(final Person person) {
		if (getPerson(person.id()) != null) {
			throw new IllegalArgumentException("Person with this id already exists!");
		}
		if (getPerson(person.emailAddress()) != null) {
			throw new IllegalArgumentException("Person with this email address already exists!");
		}
		if (getPerson(person.peselNumber()) != null) {
			throw new IllegalArgumentException("Person with this pesel number already exists!");
		}
		list.add(person);
	}

	public Person getPerson(final int id) {
		return list.stream()
				.filter(person -> person.id() == id)
				.findFirst()
				.orElse(null);
	}

	public Person getPerson(final PeselNumber peselNumber) {
		return list.stream()
				.filter(person -> person.peselNumber().equals(peselNumber))
				.findFirst()
				.orElse(null);
	}

	public Person getPerson(final EmailAddress emailAddress) {
		return list.stream()
				.filter(person -> person.emailAddress().equals(emailAddress))
				.findFirst()
				.orElse(null);
	}

	public double percent(final Predicate<Person> predicate) {
		return 100. * list.stream().filter(predicate).count() / list.size();
	}

	public static String formatPerson(final Person person) {
		return String.format(
				"#%d. %s %s, %s (%s)",
				person.id(),
				person.firstName(),
				person.lastName(),
				person.peselNumber().value(),
				person.emailAddress().value()
		);
	}
}
