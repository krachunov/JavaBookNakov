package chapter06;
import java.util.Scanner;


public class Zad02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x=scanner.nextInt();
		
		for(int a=0;a<=x;a++){
			if(a%3!=0&&a%7!=0){
				System.out.println(a);
			}
		}
			
	}

}
