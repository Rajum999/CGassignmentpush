package assignment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {
	@RequestMapping(value="/emp", method =RequestMethod.GET)
	public String show() {
		
		return "welcome";

	}
	@RequestMapping(value="/submit" ,method=RequestMethod.POST)
	public String submission() {
		return "";
		
	}

}
