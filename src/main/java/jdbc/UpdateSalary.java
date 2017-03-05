package jdbc;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class UpdateSalary {
	JdbcTemplate jdbcTemplate;

	public UpdateSalary(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void updateSalary(int empid, int salary) {
		int count = jdbcTemplate.update("update employees set salary = ? where employee_id = ?", salary,empid);
        if ( count == 0 )
        	System.out.println("Sorry! Not Updated!");
        else
        	System.out.println("Updated Successfully!");
	}

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc/jdbc.xml");
		UpdateSalary bean = ctx.getBean("updateSalary", UpdateSalary.class);
		bean.updateSalary(120, 7000);
	}

}
 