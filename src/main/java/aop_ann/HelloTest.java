package aop_ann;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest {

	public static void main(String[] args) {

         ApplicationContext ctx = new  ClassPathXmlApplicationContext("aop_ann/context.xml");
         
         Printable bean =  ctx.getBean("hello", Printable.class);
         System.out.println(bean.getClass());
         bean.print();
         
         
         /*  works only with proxy target class using  proxy-target-class="true"  
         
         Hello bean =  ctx.getBean("hello", Hello.class);
         System.out.println(bean.getClass());
         System.out.println(bean instanceof Hello);
         bean.print();
         
         */
        
	}

}
