package chapter08;
import java.util.Scanner;

public class Zad07 {

	public static void reversNumber(int number) {
		while(number!=0){
			System.out.print(number%10);
			number = number/10;
		}


	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = input.nextInt();
		
		reversNumber(n);

	}

}
