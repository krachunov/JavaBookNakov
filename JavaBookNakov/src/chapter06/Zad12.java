package chapter06;
import java.util.Arrays;
import java.util.Scanner;

public class Zad12 {

	public static void main(String[] args) {
		// Въвеждаме от клавиатурата число в десетична
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number on 10numeric system");
		int number = scan.nextInt();
		// слагаме брояч, който да преброи колко пъти се завърта цикъла и
		// съответно колко да е дълъг масива в който запазвам
		int count = 0;
		for (int i = number; i > 0; i /= 2) {
			count++;
		}
		int[] array = new int[count];
		// Записване на 1 или 0 от зад на пред, според това дали има или няма
		// остатък.
		int x = (array.length) - 1;
		for (int i = number; i > 0; i /= 2) {
			if (i % 2 != 0) {
				array[x] = 1;
				x--;
			} else {
				array[x] = 0;
				x--;
			}

		}
		// Отпечатване на масива от 1 и 0
		System.out.println(java.util.Arrays.toString(array));
		for (int b : array) {
			System.out.print(b);
		}
	}
}
