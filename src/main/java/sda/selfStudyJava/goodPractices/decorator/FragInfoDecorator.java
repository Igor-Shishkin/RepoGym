package sda.selfStudyJava.goodPractices.decorator;

public class FragInfoDecorator implements FragStatistics{
    private final FragStatistics fragStatistics;

    public FragInfoDecorator(final FragStatistics fragStatistics) {
        this.fragStatistics = fragStatistics;
    }

    @Override
    public int incrementFragCount() {
        System.out.println("Enemy fragged");
        return fragStatistics.incrementFragCount();
    }

    @Override
    public int incrementDeathCount() {
        return fragStatistics.incrementDeathCount();
    }

    @Override
    public void reset() {
        fragStatistics.reset();
    }
}
