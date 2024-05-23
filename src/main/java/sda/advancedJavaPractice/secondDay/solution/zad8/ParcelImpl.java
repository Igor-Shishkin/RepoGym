package sda.advancedJavaPractice.secondDay.solution.zad8;

public class ParcelImpl implements Parcel {

	private final int xLength;
	private final int yLength;
	private final int zLength;
	private final float weight;
	private final boolean isExpress;

	public ParcelImpl(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
		this.xLength = xLength;
		this.yLength = yLength;
		this.zLength = zLength;
		this.weight = weight;
		this.isExpress = isExpress;
	}

	@Override
	public int getXLength() {
		return xLength;
	}

	@Override
	public int getYLength() {
		return yLength;
	}

	@Override
	public int getZLength() {
		return zLength;
	}

	@Override
	public float getWeight() {
		return weight;
	}

	@Override
	public boolean isExpress() {
		return isExpress;
	}

}