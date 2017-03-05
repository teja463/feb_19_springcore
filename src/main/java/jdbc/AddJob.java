package jdbc;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

public class AddJob {

	private SimpleJdbcInsert jdbcInsert;

	public void setDataSource(DataSource dataSource) {
		jdbcInsert = new SimpleJdbcInsert(dataSource).withTableName("jobs");
	}

	public void addJob(String id, String title) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("job_id",id);
		parameters.put("job_title",title);
		jdbcInsert.execute(parameters); // INSERT 
	}

	public static void main(String args[]) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc/jdbc.xml");
		AddJob bean = (AddJob) ctx.getBean("addJob");
		bean.addJob("t1","Testing 1");
	}
}
