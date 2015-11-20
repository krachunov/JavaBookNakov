import java.util.Scanner;

public class Zad09 {

	public static void reversNumber(int number) {
		if (number < 0) {
			System.out.println("Enter the positive number");
			 return;
		}
		while (number != 0) {
			System.out.print(number % 10);
			number = number / 10;
		}

	}

	public static void avrSum(double[] numbers) {
		if (numbers.length <= 0) {
			System.out.println("Please enter the length and numbers");
			return;
		}
		double sum = 0;
		double avr = 0;
		for (double num : numbers) {
			sum += num;
		}
		sum = sum / numbers.length;
		System.out.println("The average sum is: " + sum);
	}

	public static void linearEquation(int a, int b) {
		if (a == 0) {
			System.out.println("The A is different from 0");
		}
		int x;
		// a * x + b = 0.
		x = -b / a;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("x: " + x);
		System.out.println((a * x + b));
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose what program you bå like run");
		System.out.println("Press 1 - revers number");
		System.out.println("Press 2 - Average sum");
		System.out.println("Press 3 - Linear Equation ( a * x + b = 0)");
		int n = scan.nextInt();
if (n<1||n>3){
	System.out.println("Enter the number between 1 and 3");
	 n = scan.nextInt();
}
		switch (n) {
		case 1:
			System.out.print("Enter the number: ");
			int z = scan.nextInt();
			reversNumber(z);
			break;
		case 2:
			System.out.println("Enter the length: ");
			int y = scan.nextInt();
			double[] num = new double[y];
			for (int a = 0; a < y; a++) {
				System.out.print("Enter the " + a + "possition");
				num[a] = scan.nextInt();
			}
			avrSum(num);
			break;
		case 3:
			System.out.println("Enter the a");
			int number1 = scan.nextInt();
			System.out.println("Enter the b");
			int number2 = scan.nextInt();
			linearEquation(number1, number2);
			break;
		default:
			System.out.println("Error");
		}
	}
}
