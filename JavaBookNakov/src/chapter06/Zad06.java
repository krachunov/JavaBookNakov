package chapter06;
import java.util.Scanner;

public class Zad06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the K!");
		int K = scan.nextInt();
		System.out.print("Enter the N!");
		int N = scan.nextInt();
		int sum = K;
		int sum2 = N;
		for (int i = K; i > 1; i--) {
			sum *= ((i - 1));
		}
		for (int i = N; i > 1; i--) {
			sum2 *= ((i - 1));
		}
		K = sum;
		N = sum2;
		System.out.println("K is "+K);
		System.out.println("N is "+N);
		if(1<K&&K<N){
			System.out.println("N!/K! = "+N/K);
		}
		else{
			System.out.println("Equels 1<K<N not true");
		}
 
	}
}
