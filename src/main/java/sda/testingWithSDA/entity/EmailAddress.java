package sda.testingWithSDA.entity;

public record EmailAddress(String value) {
	public EmailAddress {
		if (!value.contains("@")) {
			throw new IllegalArgumentException("Email address must contain '@' sign!");
		}
	}
}

