package chapter06;
import java.util.Scanner;

public class Zad03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the array length");
		int x = scanner.nextInt();
		int tempMin = 0;
		int tempMax = 0;
		
		int array[] = new int[x];

		for (int i = 0; i < x; i++) {
			System.out.printf("Enter the value to " + i
					+ " possition on the array");
			array[i] = scanner.nextInt();
			if(array[i]>tempMax){
			tempMax=array[i];	
			
			
			}
			if(tempMin>array[i]){
				tempMin=array[i];
			}
		}
		
		System.out.println(java.util.Arrays.toString(array));
		System.out.println("Max value is: "+tempMax);
		System.out.println("Min value is: "+tempMin);
	}

}
