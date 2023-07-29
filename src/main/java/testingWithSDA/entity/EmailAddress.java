package testingWithSDA.entity;

public record EmailAddress(String value) {
	public EmailAddress(final String value) {
		if (value.contains("@")) {
			this.value = value;
		} else {
			this.value = null;
		}
	}
}
