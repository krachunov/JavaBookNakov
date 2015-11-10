package chapter13;
import java.lang.*;

public class Zad03 {
	public static int indexOfText(String someText, String expression) {
		int index = 0;
		index = someText.indexOf(expression);
		// System.out.println(index);
		return index;
	}


	public static void stuckStr(String... str) {
	String all = "aaaa";
	all+=str;
	System.out.println(all);
	}

	public static void main(String[] args) {
		String text = "We are living in a yellow submarine. We don't have anything else";
	stuckStr(text);

	}

}
