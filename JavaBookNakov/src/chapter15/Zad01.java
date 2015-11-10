package chapter15;
import java.io.*;
import java.util.Scanner;
public class Zad01 {

	public static void main(String[] args) {
		Scanner fileInput = null;
		int numLine = 0;
		String file = "testZad1.txt";
		
		try {
			fileInput = new Scanner((Readable) new File());
			while (fileInput.hasNextLine()) {
				numLine++;
				System.out
						.printf("Line %d:%s%n", numLine, fileInput.nextLine());
			}
		} finally {
			if (null != fileInput) {
				fileInput.close();
			}

		}
	}
}
