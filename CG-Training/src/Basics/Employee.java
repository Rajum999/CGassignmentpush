package Basics;

public class Employee {
	String name;
	int id;
	double salary;
	String department;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Employee(String name, int id, double salary, String department) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", department=" + department + "]";
	}
	
	
	

}
