package books_java;

import java.util.ArrayList;
import java.util.List;


public class JavaBooks implements Books{

	@Override
	public List<String> getBooks() {
		 List<String>  books = new ArrayList<>();
		 
		 books.add("Java Complete Reference");
		 books.add("Spring in Action");
		 return books;
	}
	

}
