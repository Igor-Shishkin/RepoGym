package sda.advancedJavaPractice.secondDay.myZad25;

public class Basket {

	private static final int MAX_ELEMENTS = 10;
	private static final int MIN_ELEMENTS = 0;
	private int element = 0;

	public void addToBasket() throws BasketFullException {
		if (element >= MAX_ELEMENTS) {
			throw new BasketFullException();
		}
		this.element++;
	}

	public void removeFromBasket() throws BasketEmptyException {
		if (element <= MIN_ELEMENTS) {
			throw new BasketEmptyException();
		}
		this.element--;
	}
}
