package books;

import java.util.ArrayList;
import java.util.List;


public class JavaBooks implements Books{

     
	public JavaBooks() {
		System.out.println("JavaBooks()");
	}
	
	@Override
	public List<String> getBooks() {
		 List<String>  books = new ArrayList<String>();
		 
		 books.add("Java Complete Reference");
		 books.add("Spring in Action");
		 return books;
	}
	

}
