package chapter08;
public class Zad02 {

	public static int getMax(int number1, int number2) {
		int max = 0;
		if(number1>number2){
			max=number1;
		}
		else{
			max=number2;
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println("max number is: "+getMax(10, 2));

	}

}
