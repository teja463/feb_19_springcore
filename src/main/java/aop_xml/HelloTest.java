package aop_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest {

	public static void main(String[] args) {

         ApplicationContext ctx = new  ClassPathXmlApplicationContext("aop_xml/context.xml");
         Hello bean =  ctx.getBean("hello", Hello.class);
         // System.out.println( bean.getClass());
         
         bean.print();
         
         // bean.process(-10);
         
	}

}
