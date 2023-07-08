package advancedJavaPractice.firstDay.solution.zad7;

public class Main {

	public static void main(String[] args) {
		Jacket jacket = new Jacket(3);
		System.out.println(jacket.isLoaded());

		jacket.loadBullet("pierwsze bum");
		System.out.println(jacket.isLoaded());
		jacket.loadBullet("drugie bum");
		jacket.loadBullet("trzecie bum");
		jacket.loadBullet("przesadziliśmy");

		jacket.shot();
		jacket.shot();
		jacket.shot();
		jacket.shot();
	}
}
