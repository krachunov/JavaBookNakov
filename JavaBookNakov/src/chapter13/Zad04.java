package chapter13;
import java.lang.*;
public class Zad04 {
	public static String forbiddenWord = "Java,JVM,Microsoft";
	public static String text = "Microsoft announced its next generation Java compiler today. It uses advanced parser and special optimizer for the Microsoft JVM.";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] word = forbiddenWord.split("[\\d\\s,:]+");
		 for(String wordS : word) {
	            System.out.print(wordS + " ");
	        }
	}

}
