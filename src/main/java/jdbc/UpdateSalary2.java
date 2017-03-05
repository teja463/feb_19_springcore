package jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.support.JdbcDaoSupport;


public class UpdateSalary2 extends JdbcDaoSupport
{
    public void updateSalary(int empid, int salary) {
    	int count = getJdbcTemplate().update("update employees set salary = ? where employee_id = ?",
    			                              salary,empid);
    	if (count == 0)
    		throw new RuntimeException("Sorry! Unable to update employee salary!");
    }
    
    public static void main(String args[]) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc/jdbc.xml");
        UpdateSalary2 bean = ctx.getBean("updateSalary2", UpdateSalary2.class);
        bean.updateSalary(320,5500);
    }
}
