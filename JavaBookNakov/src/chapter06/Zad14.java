package chapter06;
import java.util.Scanner;

public class Zad14 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the binari number ");
		long number = scn.nextInt();
		int count = 0;

		// Set the array length
		for (long i = number; i > 0; i /= 16) {
			count++;
		}
		int[] array = new int[count];

		// convert operation
		for (int i = array.length - 1; i >= 0; i--) {
			array[i] = (int) (number % 16);
			number /= 16;
			// System.out.println(array[i]);
		}
		for (int ii = 0; ii < array.length; ii++) {

			switch (array[ii]) {
			case 1:
				System.out.print("1");
				break;  
			case 2:
				System.out.print("2");
				break;
			case 3:
				System.out.print("3");
				break;
			case 4:
				System.out.print("4");
				break;
			case 5:
				System.out.print("5");
				break;
			case 6:
				System.out.print("6");
				break;
			case 7:
				System.out.print("7");
				break;
			case 8:
				System.out.print("8");
				break;
			case 9:
				System.out.print("9");
				break;
			case 10:
				System.out.print("A");
				break;
			case 11:
				System.out.print("B");
				break;
			case 12:
				System.out.print("C");
				break;
			case 13:
				System.out.print("D");
				break;
			case 14:
				System.out.print("E");
				break;
			case 15:
				System.out.print("F");
				break;
			default:
				System.out.print("Error");
			}
		}
	}
}
