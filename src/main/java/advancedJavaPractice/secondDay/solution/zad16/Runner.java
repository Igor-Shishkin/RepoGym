package advancedJavaPractice.secondDay.solution.zad16;

import java.time.Duration;

public enum Runner {
	BEGINNER(Duration.ofMinutes(240), Duration.ofMillis(Long.MAX_VALUE)),
	INTERMEDIATE(Duration.ofMinutes(150), Duration.ofMinutes(240)),
	ADVANCED(Duration.ZERO, Duration.ofMinutes(150));

	private final Duration min;
	private final Duration max;

	Runner(Duration min, Duration max) {
		this.min = min;
		this.max = max;
	}

	public Duration getMin() {
		return min;
	}

	public Duration getMax() {
		return max;
	}

	static Runner getFitnessLevel(Duration runTime) {

		if (runTime.compareTo(ADVANCED.max) < 0) {
			return ADVANCED;
		} else if (runTime.compareTo(INTERMEDIATE.max) < 0 &&
				runTime.compareTo(INTERMEDIATE.min) >= 0) {
			return INTERMEDIATE;
		}
		return BEGINNER;
	}

	static Runner getFitnessLevelDynamic(Duration runTime) {
		Runner[] values = values();
		for (Runner value : values) {
			if (runTime.compareTo(value.max) < 0 && runTime.compareTo(value.min) >= 0) {
				return value;
			}
		}
		throw new IllegalArgumentException("Can't classify run time: " + runTime);
	}
}
