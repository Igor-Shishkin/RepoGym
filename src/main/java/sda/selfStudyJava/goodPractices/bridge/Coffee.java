package sda.selfStudyJava.goodPractices.bridge;

public class Coffee implements Drink{
    public Coffee() {
        System.out.println("Please, your coffee");
    }

    @Override
    public String getVolume() {
        return "500 ml";
    }

    @Override
    public boolean isAddictive() {
        return true;
    }

    @Override
    public int getNumberOfSugarLumps() {
        return 0;
    }

    @Override
    public Taste getTaste() {
        return Taste.BITTER;
    }
}
