package chapter06;
import java.util.Scanner;


public class Zad10 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the value: ");
		int x=scn.nextInt();
		
		int array[][] = new int[x][x];
		for (int i=0;i<=x-1;i++){
			for(int j=0;j<=x-1;j++){
				System.out.println("Enter the row");
				array[i][j]=scn.nextInt();
//				System.out.println(java.util.Arrays.toString(array[i][j]));
			}
		}
		System.out.println(java.util.Arrays.toString(array));
	}

}
