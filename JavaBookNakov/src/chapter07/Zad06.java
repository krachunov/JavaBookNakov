package chapter07;
import java.util.Scanner;

public class Zad06 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the N: ");
		int N = scn.nextInt();
		System.out.print("Enter the K: ");
		int K = scn.nextInt();
		
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the " + i + " value to array: ");
			arr[i] = scn.nextInt();
		}
		int sum = 0;
		int bestSum = 0;
		int index = 0;
		int bestIndex = 0;
		int j = 0;
		int tmp = 0;
		for (j = 0; j <= (N - K); j++) {
			tmp = j;
			for (int x = 0; x < K; x++) {
				System.out.println("tmp: " + tmp);
				sum += arr[tmp];
				index=tmp;
				tmp++;
				index = tmp - K;
			}
			System.out.println();
			if (sum > bestSum) {
				bestSum = sum;
				bestIndex=index;
				
			}
			sum = 0;
		}
	
		System.out.println("Best Sum: " + bestSum);
		System.out.println("Best Index: " + bestIndex);
		for(int x=index;x<arr.length;x++){
			System.out.print(arr[x]+",");
		}
	

	}
}
