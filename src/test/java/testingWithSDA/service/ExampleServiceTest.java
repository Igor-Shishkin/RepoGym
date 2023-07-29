package testingWithSDA.service;

import org.junit.jupiter.api.Test;
import testingWithSDA.entity.EmailAddress;
import testingWithSDA.service.ExampleService;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ExampleServiceTest {
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
