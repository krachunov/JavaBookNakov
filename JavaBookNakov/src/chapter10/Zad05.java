package chapter10;
public class Zad05 {
	public static int[] masiv = { 0, 9, 8, 3, 34, 2, 6, 5, 44, 3 };

	public static void mergeArray(int[] array) {
		// stop the loop
		if (array.length < 2) {
			return;
		}
		// Finde the middle of array
		int start = 0;
		int end = array.length - 1;
		int middle = ((start + end) / 2);

		// Set the left array
		int startLeft = start;
		int endLeft = middle;
		int[] tmpLeftArray = new int[middle + 1];

		// Set the right array
		int startRight = middle + 1;
		int edntRight = end;
		int[] tmpRightArray = new int[end - middle];
		int count = 0;

		// create left array
		for (int i = startLeft; i <= endLeft; i++) {
			tmpLeftArray[i] = masiv[i];
		}
		// create right array
		for (int ii = startRight; ii <= edntRight; ii++) {
			tmpRightArray[count] = masiv[ii];
			count++;
		}
		mergeArray(tmpLeftArray);
		mergeArray(tmpRightArray);

		System.out.println(java.util.Arrays.toString(tmpLeftArray));
		System.out.println(java.util.Arrays.toString(tmpRightArray));

	}

	public static void sort(int[] arrLeft, int[] arrRight) {
		int[] tmpArray = new int[(arrLeft.length + arrRight.length) - 1];
		int countArray = 0;
		int arrX = 0;
		int arrY = 0;

		while (arrX < arrLeft.length - 1 || arrY < arrRight.length - 1) {
			if (arrLeft[arrX] < arrRight[arrY]) {
				tmpArray[countArray] = arrLeft[arrX];
				arrX++;
				countArray++;

			} else {
				tmpArray[countArray] = arrRight[arrY];
				arrY++;
				countArray++;

			}
		}
		if (arrX >= arrLeft.length) {
			while (arrY < arrRight.length) {
				tmpArray[countArray] = arrRight[arrY];
				arrY++;
				countArray++;
			}
		}
		if ((arrY >= arrRight.length)) {
			while (arrX < arrLeft.length) {
				tmpArray[countArray] = arrLeft[arrX];
				arrX++;
				countArray++;
			}
		}
		System.out.println(java.util.Arrays.toString(tmpArray));

	}

	public static void main(String[] args) {
		// mergeArray(masiv);
		int[] left = { 6, 7, 8, 9 };
		int[] right = { 1, 2, 3, 4 };
		sort(left, right);

	}

}
