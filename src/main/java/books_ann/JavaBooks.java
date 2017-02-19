package books_ann;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

// @Component 	
public class JavaBooks implements Books{

	@PostConstruct 
	public void  init() {
		System.out.println("init()");
	}
	
	@Override
	public List<String> getBooks() {
		 List<String>  books = new ArrayList<String>();
		 
		 books.add("Java Complete Reference");
		 books.add("Spring in Action");
		 return books;
	}
	

}
