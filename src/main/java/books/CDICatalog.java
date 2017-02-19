package books;

import books.Books;


public class CDICatalog {
    private  Books books; 
    
    // constructor dependency 
    public CDICatalog(Books books) {
    	 System.out.println("CDICatalog()");
		 this.books = books;
	}

   
    public void print() {
    	for(String book : books.getBooks()) {
    		System.out.println(book);
    	}
    }
    
}
