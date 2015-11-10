package chapter14;
import java.util.*;

public class Library {
	private String nameLibrary;
	static Book listBook = new Book();
	static ArrayList<Book> listBoking = new ArrayList<Book>();

	public String getNameLibrary() {
		return nameLibrary;
	}

	public void setNameLibrary(String nameLibrary) {
		this.nameLibrary = nameLibrary;
	}

//	public static void addingBookToLibrary(String bookName) {
//		Book bookN = new Book();
//		bookN.setName(bookName);
//		listBoking.add(bookN);
//	}

}
