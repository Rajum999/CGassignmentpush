package springassignment;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserLogic {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("student.xml");
		
		//context.registerShutdownHook();
		Employee employee= (Employee) context.getBean("employee");
		employee.show();
		
	}

}
