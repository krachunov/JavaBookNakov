package chapter10;
public class Zad04 {
	public static int[] arr22 = new int[2];

	public static void loop(int count) {
		if (count > 1) {

			return;
		}
		for (int z = 1; z <= 3; z++) {
			System.out.println("count: "+count);
			System.out.println(z);
			loop(count + 1);
		}

	}

	public static void main(String[] args) {
		loop(0);
	}

}
