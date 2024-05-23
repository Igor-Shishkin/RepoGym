package testingWithSDA.entity;

import org.assertj.core.api.ThrowableAssert;
import sda.testingWithSDA.entity.EmailAddress;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class EmailAddressTest {
	@ParameterizedTest
	@MethodSource("getCorrectData")
	void testCorrectEmail(final String email) {
		// when
		final EmailAddress emailAddress = new EmailAddress(email);

		// then
		assertThat(emailAddress.value()).isEqualTo(email);
	}

	@ParameterizedTest(name = "Testing for \"{0}\"")
	@MethodSource("getIncorrectData")
	void testIncorrectEmail(final String email) {
		// when
		final ThrowableAssert.ThrowingCallable callable = () -> new EmailAddress(email);

		// then
		assertThatThrownBy(callable)
				.isInstanceOf(IllegalArgumentException.class)
				.hasMessage("Email address must contain '@' sign!");
	}

	private static Collection<Object[]> getCorrectData() {
		final Object[][] data = {
				{"abc@xx.pl"},
				{"@"},
				{"xxx@xxxx.xxx"}
		};
		return Arrays.asList(data);
	}

	private static Collection<Object[]> getIncorrectData() {
		final Object[][] data = {
				{"abc"},
				{""},
				{"funny-email"}
		};
		return Arrays.asList(data);
	}
}


