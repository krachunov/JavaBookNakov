import java.util.Scanner;

public class Zad01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name = input.next();
		
		printName(name);
	}

	public static void printName(String enterName) {
		System.out.println("Hello "+enterName);
	}
}
