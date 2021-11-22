package annotations;
import java.lang.annotation.*;



public class UserLogic {

	public static void main(String[] args) throws Exception{
		
		Employee employee = new Employee("Nireekshan","StandUser");
		employee.getEmployeeDetails();;
		Class c = employee.getClass();
		Annotation ann = c.getAnnotation(Info.class);
		Info e = (Info)ann;
		System.out.println("***********************************");
		System.out.println("The data about Info Annotation");
		System.out.println(e.AuthorID());
		System.out.println(e.Date());
		System.out.println(e.Time());
		System.out.println(e.Version());
		

	}

}
