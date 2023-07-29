package testingWithSDA.service;

import java.util.Objects;

public class ExampleService {
	private int value;

	public ExampleService(final int value) {
		this.value = value;
	}

	public ExampleService() {
		this(0);
	}

	public int getValue() {
		return value;
	}

	public void setValue(final int value) {
		this.value = value;
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
