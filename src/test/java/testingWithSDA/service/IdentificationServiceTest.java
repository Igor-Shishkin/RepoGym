package testingWithSDA.service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IdentificationServiceTest {
	@Test
	void testOneNextCall() {
		// given
		final IdentificationService identificationService = new IdentificationService();

		// when
		final int next = identificationService.next();

		// then
		assertThat(next).isZero();
	}

	@Test
	void testMultipleNextCall() {
		// given
		final IdentificationService identificationService = new IdentificationService();

		// when
		identificationService.next();
		identificationService.next();
		identificationService.next();
		identificationService.next();
		final int next = identificationService.next();

		// then
		assertThat(next).isEqualTo(4);
	}
}

