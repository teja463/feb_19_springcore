package books_java;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

public class OracleBooks implements Books{

	@Override
	public List<String> getBooks() {
		 List<String>  books = new ArrayList<>();
		 
		 books.add("Oracle Complete Reference");
		 books.add("Oracle SQL");
		 books.add("PL/SQL Programming");
		 return books;
	}
	

}
