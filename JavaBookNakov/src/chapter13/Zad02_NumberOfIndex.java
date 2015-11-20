package chapter13;
public class Zad02_NumberOfIndex {

	public static void numberOFIndex(String someText, String expression) {
		int index = 0;
		int count = 0;

		index = someText.indexOf(expression);

		while (index != (-1)) {
			index = someText.indexOf(expression, index + 1);
		
			count++;

		}

		System.out.println("Count: " + count);

	}

	public static void main(String[] args) {
		String text = "We are living in a yellow submarine. We don't have yellow anything else. Inside the submarine is very tight. So we are drinking all the day. We will move out of it in 5 days.";

		numberOFIndex(text, "yellow");
	}

}
