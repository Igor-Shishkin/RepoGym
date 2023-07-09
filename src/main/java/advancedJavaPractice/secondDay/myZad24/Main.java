package advancedJavaPractice.secondDay.myZad24;

public class Main {

	public static void main(String[] args) {
		Basket basket = new Basket();
		for (int i = 0; i < 11; i++) {
			try {
				basket.addToBasket();
			} catch (BasketFullException e) {
				System.out.println("Caught: "+ e);
			} finally {
				System.out.println("hello from finally");
			}
		}
		System.out.println("akuku");

		basket.removeFromBasket();

		System.out.println("akuku2");
	}

}
