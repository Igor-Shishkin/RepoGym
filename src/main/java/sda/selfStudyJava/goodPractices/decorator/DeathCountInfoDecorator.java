package sda.selfStudyJava.goodPractices.decorator;

public class DeathCountInfoDecorator implements FragStatistics{

    private final FragStatistics fragStatistics;

    public DeathCountInfoDecorator(final FragStatistics fragStatistics) {
        this.fragStatistics = fragStatistics;
    }

    @Override
    public int incrementFragCount() {
        return fragStatistics.incrementFragCount();
    }

    @Override
    public int incrementDeathCount() {
        System.out.println("Fragged by an enemy");
        return fragStatistics.incrementDeathCount();
    }

    @Override
    public void reset() {
        fragStatistics.reset();
    }
}
