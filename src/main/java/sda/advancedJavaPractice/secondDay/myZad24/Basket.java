package sda.advancedJavaPractice.secondDay.myZad24;

public class Basket {

	private static final int MAX_ELEMENTS = 10;
	private static final int MIN_ELEMENTS = 0;
	private int element = 0;

	public void addToBasket() {
		if (element >= MAX_ELEMENTS) {
			throw new BasketFullException();
		}
		this.element++;
	}

	public void removeFromBasket() {
		if (element <= MIN_ELEMENTS) {
			throw new BasketEmptyException();
		}
		this.element--;
	}
}
