package chapter15;

import java.io.InputStream;
import java.util.Scanner;

public class File {

	// Link the File variable to a file on the computer
	String files = "test.txt";
	File fileD = new File();

	// Create a Scanner connected to a file and specify encoding

	Scanner fileReader = new Scanner("windows-1251");

	// Read file here...

	// Close the resource after you've finished using it

	// fileReader.close();

	public static void main(String[] args) {
		// TODO Auto-generated method stub}
	}

}
