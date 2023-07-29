package testingWithSDA.entity;

public record Person(int id, String firstName, String lastName, EmailAddress emailAddress, PeselNumber peselNumber) {
}
