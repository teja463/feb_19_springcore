package jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class ListJobTitles extends JdbcDaoSupport {

    public void listTitles() {
		List<String> titles =  getJdbcTemplate().queryForList
				                   ("select job_title from jobs", String.class);
		
		for(String title : titles)
			System.out.println(title);
	}

    
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc/jdbc.xml");
        ListJobTitles list  =  ctx.getBean("listJobTitles", ListJobTitles.class);
        list.listTitles();
    }
    

}
