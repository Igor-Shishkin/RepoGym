package advancedJavaPractice.firstDay.myZad7;

public class Main {
    public static void main(String[] args) {
        Jacket jacket = new Jacket(4);

        jacket.isLoaded();
        jacket.loadBullet("1");
        jacket.loadBullet("2");
        jacket.loadBullet("3");
        jacket.loadBullet("4");
        jacket.loadBullet("5");

        jacket.shot();
        jacket.shot();
        jacket.shot();
    }
}
