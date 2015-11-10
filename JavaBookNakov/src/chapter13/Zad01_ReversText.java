package chapter13;

public class Zad01_ReversText {

	public static String revText(String someText) {
		StringBuilder reversText = new StringBuilder();

		for (int i = someText.length() - 1; i >= 0; i--) {
			reversText.append(someText.charAt(i));
		}
		return reversText.toString();
	}

	public static void main(String[] args) {

		String text2 = "We are living in a yellow submarineEe. We don't have anything else";
		// String text2 =
		// "esle gnihtyna evah t'nod eW .eEenirambus wolley a ni gnivil era eW";
		System.out.println(revText(text2));

		/*
		 * char[] reversText = new char[text.length()]; int count = 0; for (int
		 * i = text.length() - 1; i >= 0; i--) { reversText[count] =
		 * text.charAt(i); count++; }
		 * System.out.println(java.util.Arrays.toString(reversText)); for(char
		 * b:reversText){ System.out.print(b); }
		 */
	}

}
