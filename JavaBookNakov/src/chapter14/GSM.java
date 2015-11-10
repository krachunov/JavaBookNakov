package chapter14;
public class GSM {
	private String model;
	private String brand;
	private static String nokiaN95="Nokia 95";
	private double price;
	private String owner;

	

	public static String getNokiaN95() {
		return nokiaN95;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void printInfo(){
		System.out.println();
		System.out.println("Model is: "+this.model);
		System.out.println("The phone is "+this.brand);
		}


	public GSM() {
		this.model = "TELEFON";
	}

	public GSM(String model, String brand) {
		this.model = model;
		this.brand = brand;
	}

	public GSM(double price, String owner) {
		this();
		this.price = price;
		this.owner = owner;
	}
	public void callMinus(){
		Call.callHistory--;
	}
	public void callPlus(){
		Call.callHistory++;
	}
	public void callDeleteStatus(){
		Call.callHistory=0;
	}
	public double sumCall(double price){
		double sum;
		sum=this.price*Call.callHistory;
		return sum;
	}
}
