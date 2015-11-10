package chapter07;
public class Zad02 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int[] array2 = { 1, 2, 3, 4, 5 ,6};

		boolean equal = true;
		if (array.length == array2.length) {
			for (int i = 0; i <= array.length-1; i++) {
				if (array[i] != array2[i]) {
					equal = false;
					
				}
			}
		} else {
			System.out.println("The arrays is not  equals lenght");
		}
		if (equal) {
			System.out.println("The two arrays is equal " + equal);
		} else {
			System.out.println("The arrays is not  equals lenght");
		}
	}

}
