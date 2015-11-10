package chapter14;
import java.lang.*;
public class Book {

	 String name;
	 int year;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Book() {
		this.name = "Kniga";
		this.year = 2000;
	}

	public Book(String namee) {
		this.name = namee;
	}
}
