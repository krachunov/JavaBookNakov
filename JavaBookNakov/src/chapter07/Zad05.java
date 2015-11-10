package chapter07;

public class Zad05 {

	public static void main(String[] args) {
		int[] array = { 0, 1, 1, 3, 4, 5, 3, 7, 8, 9 };

		int index = 0;
		int bestIndex = 0;
		int count = 1;
		int bestCount = 0;

		for (int i = 0; i < array.length - 1; i++) {
			if (i == 0 || array[i] <= array[i - 1]) {
				count = 1;
				index = i;
			} else {
				count++;
			}
			if (count > bestCount) {
				bestCount = count;
				bestIndex = index;
			}
		}
		for (int j = bestIndex; j < bestIndex + bestCount; j++) {
			System.out.print(array[j] + " ");
		}
	}
}
