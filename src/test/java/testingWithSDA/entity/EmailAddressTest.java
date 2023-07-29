package testingWithSDA.entity;

import org.junit.jupiter.api.Test;
import testingWithSDA.entity.EmailAddress;

import static org.assertj.core.api.Assertions.assertThat;

class EmailAddressTest {
	@Test
	void testCorrectEmail() {
		// when
		final EmailAddress emailAddress = new EmailAddress("abc@xx.pl");

		// then
		assertThat(emailAddress.value()).isEqualTo("abc@xx.pl");
	}

	@Test
	void testIncorrectEmail() {
		// when
		final EmailAddress emailAddress = new EmailAddress("abc");

		// then
		assertThat(emailAddress.value()).isNull();
	}
}
