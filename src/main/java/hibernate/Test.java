package hibernate;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Test {

    public static void main(String[] args) {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("hibernate/hibernate.xml");
    	
//  Add new Job 
     	
//    	AddJob bean = (AddJob) ctx.getBean("addJob");
//    	bean.addJob("test", "testing", 5000,10000);
//    	
//    	System.out.println("Added Job!");
    	
    	
    	
 // List Jobs

        ListJobs bean = (ListJobs) ctx.getBean("listJobs");
        List<Job> jobs  = bean.getJobs();
        
        for (Job job : jobs)
        {
        	System.out.println(job.getTitle());
        }
 	
    	
   }
}
