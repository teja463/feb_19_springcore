package books_ann;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		 ApplicationContext  context = 
				 new ClassPathXmlApplicationContext ("books_ann/beans.xml"); 
		 
	 
		 Catalog cat = context.getBean("catalog", Catalog.class);
		 cat.print();

     }

}
