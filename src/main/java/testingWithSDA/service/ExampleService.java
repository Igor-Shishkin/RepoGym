package testingWithSDA.service;

import java.util.Objects;

public class ExampleService {
	private final RandomService randomService;
	private int value;

	public ExampleService(final RandomService randomService, final int value) {
		this.randomService = randomService;
		this.value = value;
	}

	public ExampleService(final RandomService randomService) {
		this(randomService, 0);
	}

	public int getValue() {
		return value;
	}

	public void setValue(final int value) {
		this.value = value;
	}

	public int divide(final int a) {
		return value / a;
	}

	public int getRandomInt() {
		return randomService.getRandomInt(101);
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		final ExampleService that = (ExampleService) o;
		return getValue() == that.getValue();
	}

	@Override
	public int hashCode() {
		return Objects.hash(getValue());
	}

	@Override
	public String toString() {
		return "ExampleService{" +
				"value=" + value +
				'}';
	}
}

