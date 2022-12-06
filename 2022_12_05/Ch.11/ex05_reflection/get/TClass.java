package ex05_reflection.get;

public class TClass {
	private double mSpeed;
	private int mColor;

	public TClass() {

	}

	public TClass(int a, int b) {

	}

	public void setColor(int color) {
		mColor = color;
	}

	public double getSpeed() {
		return mSpeed;
	}
	
	public int getColor() {
		return mColor;
	}
}
