package def;
class BasicSensor {
	private double value;

	public BasicSensor(double value) {
		this.value = value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}

	public void clearValue() {
		this.value = 0;
	}
}


