import java.util.Scanner;

public class Zad04 {
	public static int searchingNumber(int number, int[] str) {
		int count = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i] == number) {
				count++;
			} else {
				System.out.println("The searching number is not in this array");
				break;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Surching number: ");
		int n = input.nextInt();
		int[] array = { 1, 4, 5, 5, 6, 7, 8, 9, 5, 5 };

		System.out.println("The surching number:" + n
				+ " from array is finding " + searchingNumber(n, array)
				+ " time");
	}
}
