package testingWithSDA;

import testingWithSDA.entity.Person;
import testingWithSDA.service.IdentificationService;
import testingWithSDA.service.PersonService;

import java.util.Scanner;

public final class MainTesting {
	private static final IdentificationService IDENTIFICATION_SERVICE = new IdentificationService();
	private static final PersonService PERSON_SERVICE = new PersonService(IDENTIFICATION_SERVICE);
	private static final Scanner SCANNER = new Scanner(System.in);

	public static void main(final String[] args) {
		while (true) {
			System.out.println("1. Add a person.");
			System.out.println("2. Print out all people.");
			System.out.println("0. Exit.");
			final int choice = SCANNER.nextInt();
			SCANNER.nextLine();
			switch (choice) {
				case 1 -> addPerson();
				case 2 -> printPeople();
				case 0 -> {
					return;
				}
				default -> System.out.println("Invalid choice!");
			}
		}
	}

	private static void addPerson() {
		final String firstName = SCANNER.next();
		final String lastName = SCANNER.next();
		final String email = SCANNER.next();
		final String pesel = SCANNER.next();
		final Person person = PERSON_SERVICE.createPerson(firstName, lastName, email, pesel);
		PERSON_SERVICE.addPerson(person);
		System.out.println("Added!");
	}

	private static void printPeople() {
		PERSON_SERVICE.getPeople()
				.stream()
				.map(PersonService::formatPerson)
				.forEach(System.out::println);
	}
}
