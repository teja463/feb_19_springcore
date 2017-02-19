package nsbooks;

public class Application {

	public static void main(String[] args) {
	 	 
		 // JavaBooks books = new JavaBooks();
		 Books books = new OracleBooks();
		
		 
		 Catalog cat = new Catalog();
		 cat.setBooks(books);

		 // cat.setBooks(books);
		 cat.print();

     }

}
