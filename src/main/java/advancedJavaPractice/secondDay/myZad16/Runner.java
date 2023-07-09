package advancedJavaPractice.secondDay.myZad16;

import java.time.Duration;

public enum Runner {
    BEGINNER (Duration.ofMinutes(240) , Duration.ofMillis(Long.MAX_VALUE)),
    INTERMEDIATE (Duration.ofMinutes(150) , Duration.ofSeconds(240)),
    ADVANCED (Duration.ZERO , Duration.ofSeconds(150));
    private final Duration min;
    private final Duration max;

    Runner(Duration min, Duration max) {
        this.min = min;
        this.max = max;
    }

//    static Runner getFitnessLevel (Duration runTime) {
//        if (runTime.compareTo(ADVANCED.max) < 0) {
//            return ADVANCED;
//        } else  if (runTime)
//    }
}
