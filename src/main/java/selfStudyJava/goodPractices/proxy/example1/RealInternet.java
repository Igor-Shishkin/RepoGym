package selfStudyJava.goodPractices.proxy.example1;

public class RealInternet implements Internet{
    @Override
    public void connectTo(String serverhost)
    {
        System.out.println("Connecting to "+ serverhost);
    }
}
