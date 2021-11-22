package webapp1;

public class UserValidationService {
	public boolean isUserValid(String user,String password) {
		if(user.equals("Nireekshan") && password.equals("Raju")){
			return true;
		}
		else
		return false;
	}

}
