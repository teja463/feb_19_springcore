package books_java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import books_ann.Catalog;

public class CatalogApplication {
	
	public static void main(String [] args) {
		
		 ApplicationContext ctx =
				  new AnnotationConfigApplicationContext(BooksConfiguration.class);
		 
		 
//		 books_java.Catalog catalog =  ctx.getBean("catalog", books_java.Catalog.class);
//		 
//		 books_java.Catalog catalog2 =  ctx.getBean("catalog", books_java.Catalog.class);
//		 
//		 System.out.println(catalog);
//		 System.out.println(catalog2);
//		 
		 
         //catalog.print();
         
	}

}

