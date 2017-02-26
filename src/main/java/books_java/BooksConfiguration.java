package books_java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration 
@ComponentScan( {"books_java"})
public class BooksConfiguration {

	   @Bean (name ="books")
	   public Books getBooks() {
		   return new JavaBooks();
	   }
	   
	   @Bean // (name ="oraclebooks")
	   public Books getOracleBooks() {
		   return new OracleBooks();
	   }
	   
	   
	   @Bean ( name ="catalog")
	   public Catalog getCatalog() {
		   Catalog cat =  new Catalog();
		   return cat;
	   }
}
