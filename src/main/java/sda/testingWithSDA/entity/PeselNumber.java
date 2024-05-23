package sda.testingWithSDA.entity;

public record PeselNumber(String value) {
	public PeselNumber {
		if (value.length() != 11) {
			throw new IllegalArgumentException("Pesel number must contain exactly 11 chars!");
		}
	}
}

