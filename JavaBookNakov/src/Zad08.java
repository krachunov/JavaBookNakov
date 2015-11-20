import java.util.Scanner;

public class Zad08 {
	public static long faktoriel(long number) {
		long sum = 1;
		for (int i = 1; i <= number; i++) {
			sum = sum * i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n= input.nextInt();
		for(int z=1;z<=n;z++){
			System.out.println(faktoriel(z));
		}

	}

}
