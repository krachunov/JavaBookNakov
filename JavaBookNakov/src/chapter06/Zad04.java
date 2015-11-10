package chapter06;
import java.util.Scanner;

public class Zad04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = 0;
	
			for(int ii=2;ii<=14;ii++){
				switch (ii) {
				case 2:	System.out.println("2 ");break;
				case 3:	System.out.println(3);break;
				case 4:	System.out.println(4);break;
				case 5:	System.out.println(5);break;
				case 6:	System.out.println(6);break;
				case 7:	System.out.println(7);break;
				case 8:	System.out.println(8);break;
				case 9:	System.out.println(9);break;
				case 10:System.out.println(10);break;
				case 11:System.out.println("J");break;
				case 12:System.out.println("Q");break;
				case 13:System.out.println("K");break;
				case 14:System.out.println("A");break;
					
				}
				for(int i=1;i<=4;i++){
					switch(i){
					case 1:System.out.println("Спатия");break;
					case 2:System.out.println("Каро");break;
					case 3:System.out.println("Купа");break;
					case 4:System.out.println("Пика");break;
					}
		}
		}
		
		
	

	}
}
