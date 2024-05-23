package testingWithSDA.entity;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sda.testingWithSDA.entity.PeselNumber;

import static org.assertj.core.api.Assertions.assertThat;

class PeselNumberTest {
	@BeforeEach
	public void beforeEach() {
		System.out.println("Before Each");
	}

	@BeforeAll
	public static void beforeAll() {
		System.out.println("Before All");
	}

	@AfterAll
	public static void afterAll() {
		System.out.println("After All");
	}

	@AfterEach
	public void afterEach() {
		System.out.println("After Each");
	}

	@Test
	void testCorrectPesel() {
		// when
		final PeselNumber peselNumber = new PeselNumber("12345678901");

		// then
		assertThat(peselNumber.value()).isEqualTo("12345678901");
	}

	@Test
	void testIncorrectPesel() {
		// when
		final PeselNumber peselNumber = new PeselNumber("1234");

		// then
		assertThat(peselNumber.value()).isNull();
	}
}
