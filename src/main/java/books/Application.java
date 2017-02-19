package books;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("books/beans.xml");
		
		Catalog cat = context.getBean("catalog", Catalog.class);
		cat.print();
		
		
		
//      CDICatalog cat2 = context.getBean("cdiCatalog", CDICatalog.class);
//		cat2.print();

		
		/*
		 * 
		 * Catalog cat2 = context.getBean("catalog", Catalog.class);
		 * cat2.print();
		 * 
		 * System.out.println(cat == cat2);
		 */
	}

}
