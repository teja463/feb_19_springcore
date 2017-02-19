package books_ann;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component 
public class Catalog {
    private  Books books;
    
    @Autowired
    public void setBooks(Books books) {
    	this.books = books;
    }
   
    public void print() {
    	
    	for(String book : books.getBooks()) {
    		System.out.println(book);
    	}
    }
    
}
