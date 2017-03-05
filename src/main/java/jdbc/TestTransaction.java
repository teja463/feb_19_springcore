package jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class TestTransaction extends JdbcDaoSupport {

	public void hikeSalaries(int emp1, int hike1, int emp2, int hike2) {
		
		int count = getJdbcTemplate()
				.update("update employees set salary = salary + ? where employee_id = ?",
						hike1, emp1);
		if (count == 0)
			throw new RuntimeException("Employee " + emp1 + " was not found!");
		else
			System.out.println("Updated salary of " + emp1);
		

		count = getJdbcTemplate()
				.update("update employees set salary = salary + ? where employee_id = ?",
						hike2, emp2);
		if (count == 0)
			throw new RuntimeException("Employee " + emp2 + " was not found!");
		
		System.out.println("Updated salaryof " + emp2);
	}

	public static void main(String args[]) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"jdbc/jdbc.xml");
		TestTransaction bean = ctx.getBean("testTrans", TestTransaction.class);

		bean.hikeSalaries(121, 500, 123,1000);

	}
}
