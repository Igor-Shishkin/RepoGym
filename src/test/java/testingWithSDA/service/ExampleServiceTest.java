package testingWithSDA.service;

import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import sda.testingWithSDA.service.ExampleService;
import sda.testingWithSDA.service.RandomService;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ExampleServiceTest {
	@Test
	void testGetValueNoInitialValue() {
		// given
		final ExampleService exampleService = new ExampleService(null);

		// when
		final int value = exampleService.getValue();

		// then
		assertAll(
				() -> assertEquals(0, value),
				() -> assertEquals(0, value)
		);
		assertTrue(value >= 0);
		assertThat(value).isNotNegative();

		assertEquals(0, value);
		assertThat(value).isZero();
	}

	@ParameterizedTest(name = "Test {0}!")
	@ValueSource(ints = {2, 3, 5, 7, 10, 832, 2764})
	void testDivideByNotZero(final int value) {
		// given
		final ExampleService exampleService = new ExampleService(null, 1);

		// when
		final int result = exampleService.divide(value);

		// then
		assertThat(result).isZero();
	}

	@ParameterizedTest(name = "ArgProvider: {0}/{1} == {2}?")
	@ArgumentsSource(MyProvider.class)
	void testDivideArgumentsProvider(final int a, final int b, final int c) {
		// given
		final ExampleService exampleService = new ExampleService(null, a);

		// when
		final int result = exampleService.divide(b);

		// then
		assertThat(result).isEqualTo(c);
	}

	@ParameterizedTest(name = "Method: {0}/{1} == {2}?")
	@MethodSource("getData")
	void testDivideMethodProvider(final int a, final int b, final int c) {
		// given
		final ExampleService exampleService = new ExampleService(null, a);

		// when
		final int result = exampleService.divide(b);

		// then
		assertThat(result).isEqualTo(c);
	}

	@Test
	void testDivideByZero() {
		// given
		final ExampleService exampleService = new ExampleService(null, 10);

		// when
		final ThrowableAssert.ThrowingCallable callable = () -> exampleService.divide(0);

		// then
		assertThatThrownBy(callable)
				.isInstanceOf(ArithmeticException.class)
				.hasMessage("/ by zero");
	}

	@Test
	void testDivideByZero1() {
		// given
		final ExampleService exampleService = new ExampleService(null, 10);

		// when
		final Executable executable = () -> exampleService.divide(0);

		// then
		final ArithmeticException exception = assertThrows(ArithmeticException.class, executable);
		assertEquals("/ by zero", exception.getMessage());
	}

	@Test
	void testRandomInt() {
		// given
		final RandomService randomService = mock(RandomService.class);
		when(randomService.getRandomInt(anyInt())).thenReturn(5);
		final ExampleService exampleService = new ExampleService(randomService);

		// when
		final int randomInt = exampleService.getRandomInt();

		// then
		assertThat(randomInt).isEqualTo(5);
	}

	static Collection<Object[]> getData() {
		final Object[][] data = {
				{1, 2, 0},
				{5, 2, 2},
				{9, 1, 9}
		};
		return Arrays.asList(data);
	}

	private static class MyProvider implements ArgumentsProvider {
		@Override
		public Stream<? extends Arguments> provideArguments(final ExtensionContext extensionContext) {
			return Stream.of(
					Arguments.of(1, 2, 0),
					Arguments.of(5, 2, 2),
					Arguments.of(9, 1, 9));
		}
	}
}
