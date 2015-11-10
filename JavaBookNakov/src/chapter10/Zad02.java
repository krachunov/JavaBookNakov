package chapter10;
import java.util.Scanner;

public class Zad02 {
	public static int numberOfLoop;
	public static int numberOfIteration;
	public static int[] arr;
	
	public static void print(){
		for (int z = 0; z < numberOfLoop; z++) {
			System.out.printf("%d ", arr[z]);
		}
		System.out.println();
	
	}

	public static void loop(int currentLoop) {
		if (currentLoop == numberOfLoop) {
//			print();
			return;
		}
		
		for (int i = 1; i <= numberOfIteration; i++) {
			arr[currentLoop] = i;
		
			loop(currentLoop + 1);
			System.out.println(java.util.Arrays.toString(arr));
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("¬карай бро€ на циклите");
		numberOfLoop = scan.nextInt();

		System.out.println("¬карай бро€ на итерациите");
		numberOfIteration = scan.nextInt();

		arr = new int[numberOfLoop];
		loop(0);
		
	

	}

}
