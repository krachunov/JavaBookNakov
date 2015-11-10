package chapter05;
import java.util.Scanner;

public class Zad8 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.printf("Enter youre score");
		int a = scn.nextInt();
		switch (a) {
		case 1:
			a = a * 10;
			System.out.println(a);
			break;
		case 2:
			a = a * 10;
			System.out.println(a);
			break;
		case 3:
			a = a * 10;
			System.out.println(a);
			break;
		case 4:
			a = a * 100;
			System.out.println(a);
			break;
		case 5:
			a = a * 100;
			System.out.println(a);
			break;
		case 6:
			a = a * 100;
			System.out.println(a);
			break;
		case 7:
			a = a * 1000;
			System.out.println(a);
			break;
		case 8:
			a = a * 1000;
			System.out.println(a);
			break;
		case 9:
			a = a * 1000;
			System.out.println(a);
			break;
		default:
			System.out.println("Error");
		}

	}

}
