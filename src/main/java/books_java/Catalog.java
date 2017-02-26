package books_java;

import org.springframework.beans.factory.annotation.Autowired;

public class Catalog {
	Books books;

	@Autowired
	public void setBooks(Books books) {
		System.out.println(books);
		this.books = books;
	}

	public Catalog() {
		System.out.println("Constructor");
	}

	public void print() {
		for (String book : books.getBooks()) {
			System.out.println(book);
		}
	}

}
