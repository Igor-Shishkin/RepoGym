package testingWithSDA.entity;

public record PeselNumber(String value) {
	public PeselNumber(final String value) {
		if (value.length() == 11) {
			this.value = value;
		} else {
			this.value = null;
		}
	}
}
