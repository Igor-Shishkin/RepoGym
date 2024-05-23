package sda.selfStudyJava.goodPractices.bridge;

public class Tea implements Drink{
    public Tea() {
        System.out.println("Please, your tea");
    }
    @Override
    public String getVolume() {
        return "200 ml";
    }

    @Override
    public boolean isAddictive() {
        return false;
    }

    @Override
    public int getNumberOfSugarLumps() {
        return 2;
    }

    @Override
    public Taste getTaste() {
        return Taste.SWEET;
    }

}
