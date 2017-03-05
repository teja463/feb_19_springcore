// Demo of RowMapper to convert a row to object 

package jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class ListAllJobs extends JdbcDaoSupport {
    public void listJobs() {
		List<Job> jobs =  getJdbcTemplate().query("select * from jobs", new JobRowMapper());
		
		for(Job job : jobs)
			System.out.printf("%-35s  - %d\n", job.getTitle(), job.getMin() );
	}
    
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc/jdbc.xml");
        ListAllJobs list  =  ctx.getBean("listAllJobs", ListAllJobs.class);
        list.listJobs();
    }


}
