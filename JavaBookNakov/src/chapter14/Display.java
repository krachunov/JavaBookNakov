package chapter14;
public class Display {
	private double displayInch;
	private int displayColor;

	public Display() {
		this.displayInch = 15;
	}
	public Display(double displayInch, int displayColor){
		this.displayInch=displayInch;
		this.displayColor=displayColor;
	}

	public double getDisplayInch() {
		return displayInch;
	}

	public void setDisplayInch(double displayInch) {
		this.displayInch = displayInch;
	}

	public int getDisplayColor() {
		return displayColor;
	}

	public void setDisplayColor(int displayColor) {
		this.displayColor = displayColor;
	}

}
