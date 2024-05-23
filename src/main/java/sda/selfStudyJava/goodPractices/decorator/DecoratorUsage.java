package sda.selfStudyJava.goodPractices.decorator;

public class DecoratorUsage {
    public static void main(String[] args) {
        FragStatistics statistics = new FirstPersonShooterFragStatistics();

        statistics.incrementDeathCount(); // na ekranie nie pojawi się nic
        statistics.incrementFragCount(); // na ekranie nie pojawi się nic

        // wykorzystanie decoratorów
        FragStatistics decoratedStatistics = new FragDeathRatioDecorator(new FragInfoDecorator(new DisplayCountersDecorator(new DeathCountInfoDecorator(statistics))));

        decoratedStatistics.incrementFragCount();
        decoratedStatistics.incrementFragCount();
        decoratedStatistics.incrementFragCount(); // because we are good players!
        decoratedStatistics.incrementDeathCount();
        decoratedStatistics.incrementFragCount();
        decoratedStatistics.incrementDeathCount();
        decoratedStatistics.incrementFragCount();

    }
}
