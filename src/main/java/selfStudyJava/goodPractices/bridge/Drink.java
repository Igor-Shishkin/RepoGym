package selfStudyJava.goodPractices.bridge;

public interface Drink {
    String getVolume();
    boolean isAddictive();
    int getNumberOfSugarLumps();
    Taste getTaste();
}
