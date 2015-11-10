package chapter06;
import java.util.Scanner;

public class Zad06_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the K!");
		int K = scan.nextInt();
		System.out.print("Enter the N!");
		int N = scan.nextInt();

		int sum = K;
		int sum2 = N;
		int NK = N-K;
		int sum3 = NK;

		for (int i = K; i > 1; i--) {
			sum *= ((i - 1));
		}

		for (int i = N; i > 1; i--) {
			sum2 *= ((i - 1));
		}
		System.out.println("KN is " + NK);
		for (int i = NK; i > 1; i--) {
			sum3 *= ((i - 1));
		}
		

		K = sum;
		N = sum2;
		NK = sum3;
		System.out.println("K is " + K);
		System.out.println("N is " + N);
		System.out.println("KN is " + NK);
		// N!*K!/(N-K)!

		System.out.println("N!*K!/(N-K)! = " + N * K / (NK));


	}
}
