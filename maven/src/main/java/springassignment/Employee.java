package springassignment;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Employee implements InitializingBean,DisposableBean{
	private String name;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
//	public Employee(String name, int id) {
//		super();
//		this.name = name;
//		this.id = id;
	//}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	public void show() {
		System.out.println("the employee name is "+ getName());
		System.out.println("the employee id is "+ getId());
	}
	public void destroy() throws Exception {
		System.out.println("The bean is destroyed");
		
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("The bean is initialized");
		
	}
	@PostConstruct
	public void des() {
		System.out.println("destroyed from the initmethod from bean");
	}
	@PreDestroy
	public void set() {
		System.out.println("initialized from init method from bean");
	}
	
	

}
