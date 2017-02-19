package books;

import java.util.ArrayList;
import java.util.List;

 

public class OracleBooks implements Books{
 
	
	public OracleBooks() {
		System.out.println("OracleBooks()");
	}
	
	
	@Override 
	public List<String> getBooks() {
		 List<String>  books = new ArrayList<>();
		 
		 books.add("Oracle Complete Reference");
		 books.add("Oracle SQL");
		 books.add("PL/SQL Programming");
		 return books;
	}
	

}
