package sda.selfStudyJava.goodPractices.decorator;

import static java.util.Objects.nonNull;

public class FragDeathRatioDecorator implements FragStatistics{
    private final FragStatistics fragStatistics;

    private Integer currentFragCount = null;
    private Integer currentDeathCount = null;

    public FragDeathRatioDecorator(final FragStatistics fragStatistics) {
        this.fragStatistics = fragStatistics;
    }

    @Override
    public int incrementFragCount() {
        currentFragCount = fragStatistics.incrementFragCount();
        displayFragDeathsRation();
        return currentFragCount;
    }

    @Override
    public int incrementDeathCount() {
        currentDeathCount =  fragStatistics.incrementDeathCount();
        displayFragDeathsRation();
        return currentDeathCount;
    }

    private void displayFragDeathsRation() {
        if (nonNull(currentFragCount) && nonNull(currentDeathCount)) {
            System.out.println("KDR is " + (double) currentFragCount / currentDeathCount);
        }
    }

    @Override
    public void reset() {
        fragStatistics.reset();
    }
}
