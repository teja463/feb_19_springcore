package books;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeDemo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("books/beans.xml");
		
		Catalog cat1 = context.getBean("catalog", Catalog.class);
		Catalog cat2 = context.getBean("catalog", Catalog.class);
		
		System.out.println(cat1.hashCode());
		System.out.println(cat2.hashCode());
	}

}
