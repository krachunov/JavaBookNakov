package chapter10;
public class loop {

	public static void loop(int count) {
		if (count > 3) {
			return;
		}
		for (int i = 0; i < 3; i++) {
			System.out.print(i);
			
			loop(count + 1);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		loop(1);

	}

}
