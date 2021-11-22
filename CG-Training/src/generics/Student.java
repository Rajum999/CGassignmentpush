package generics;

public class Student {
	int ID;
	String name;
	String department;
	public Student(int iD, String name, String department) {
		super();
		ID = iD;
		this.name = name;
		this.department = department;
	}
	@Override
	public String toString() {
		return "Student [ID=" + ID + ", name=" + name + ", department=" + department + "]";
	}
	
	

}
