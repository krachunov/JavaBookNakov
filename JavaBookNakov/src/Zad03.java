import java.util.Scanner;

public class Zad03 {

	public static int lastNumber(int number) {
		int mountNumber = number % 10;
		return mountNumber;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = input.nextInt();
		
		switch (lastNumber(n)) {
		case 1:
			System.out.println("The last figure: One");break;
		case 2:
			System.out.println("The last figure: Two");break;
		case 3:
			System.out.println("The last figure: Three");break;
		case 4:
			System.out.println("The last figure: Four");break;
		case 5:
			System.out.println("The last figure: Five");break;
		case 6:
			System.out.println("The last figure: Six");break;
		case 7:
			System.out.println("The last figure: Seven");break;
		case 8:
			System.out.println("The last figure: Eight");break;
		case 9:
			System.out.println("The last figure: Nine");break;
		case 0:
			System.out.println("The last figure: Zero");break;
		default:
			System.out.println("The last figure: Error");break;
		}
	}
}
