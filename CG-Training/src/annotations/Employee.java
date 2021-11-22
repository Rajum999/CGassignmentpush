package annotations;
@Info(AuthorID =123, Date ="06-Nov-2021", Time ="08:15pm", Version =8)
public class Employee {
	String name;
	String department;
	public Employee(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}
	
	public void getEmployeeDetails() {
		System.out.println("Employee name "+name);
		System.out.println("Employee Department "+ department);
	}
	
	

}
