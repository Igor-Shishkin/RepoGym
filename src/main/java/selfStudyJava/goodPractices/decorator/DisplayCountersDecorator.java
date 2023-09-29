package selfStudyJava.goodPractices.decorator;

public class DisplayCountersDecorator implements FragStatistics{
    private final FragStatistics fragStatistics;

    public DisplayCountersDecorator(final FragStatistics fragStatistics) {
        this.fragStatistics = fragStatistics;
    }

    @Override
    public int incrementFragCount() {
        int fragCount = fragStatistics.incrementFragCount();
        System.out.println("Your frag count is now " + fragCount);
        return fragCount;
    }

    @Override
    public int incrementDeathCount() {
        final int deathCount = fragStatistics.incrementDeathCount();
        System.out.println("Your death count is now " + deathCount);
        return deathCount;
    }

    @Override
    public void reset() {
        fragStatistics.reset();
        System.out.println("Stats reset - KDR is equal to 0");
    }
}
