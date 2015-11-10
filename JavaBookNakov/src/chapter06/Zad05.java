package chapter06;
import java.util.Scanner;

public class Zad05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int fib = scan.nextInt();
		int n = 0;
		int number[] = new int[fib];
		System.out.println(n);

		for (int i = 0; i <= fib-1; i++) {
			if (n <= 2) {
				number[i]=n;
				n++;
				System.out.println(n);
			}
			else{
			System.out.println(number[i] = number[i - 1] + number[i-2]);
		
			}
		}
	}

}
//резултата в началото не е 1,1,2,5.....ами 1,2,3,5...