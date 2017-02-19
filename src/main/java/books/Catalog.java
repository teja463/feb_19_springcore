package books;

import books.Books;

public class Catalog {

	private Books books;

	public Catalog() {
		System.out.println("Catalog()");
	}
	
	public void startup() {
		System.out.println("startup()");
	}

	public void setBooks(Books books) {
		System.out.println("setBooks()");
		this.books = books;
	}

	public void print() {
		for (String book : books.getBooks()) {
			System.out.println(book);
		}
	}

}
