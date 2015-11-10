package chapter07;
public class Zad08 {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 8, 8, 8, 5, 8, 5, 8, 2, 8, 8 };
		int count = 1;
		int bestCount = 0;
		int index = 0;
		int bestIndex = 0;
		//Обхождаме масива
		for (int i = 0; i <= arr.length - 1; i++) {
			//Втория цикъл обхождаме масива пак за 2рото сравнявано число
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					index = arr[i];

					if (count > bestCount) {
						bestCount = count;
						bestIndex = arr[i];

					}
				}

			}
			count = 1;
			index = 0;
		}
		System.out.println("Best count: " + bestCount);
		System.out.println("Best Number: " + bestIndex);
	}

}
