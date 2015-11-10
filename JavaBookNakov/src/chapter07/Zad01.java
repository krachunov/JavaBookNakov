package chapter07;
public class Zad01 {

	public static void main(String[] args) {
		int[] array = new int[20];
		for (int i = 0; i <= array.length - 1; i++) {
			array[i] = i * 5;
		}
		for(int a:array){
			System.out.print(" "+a);
		}
	}
}
