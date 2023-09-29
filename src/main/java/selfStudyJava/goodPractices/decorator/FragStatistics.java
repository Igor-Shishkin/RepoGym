package selfStudyJava.goodPractices.decorator;

public interface FragStatistics {
    int incrementFragCount();
    int incrementDeathCount();
    void reset();
}
