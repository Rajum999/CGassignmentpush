package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class Myname {
	
	@RequestMapping(value = "/raju")
	public String get() {
		return "Sachin";
		
	}
	
	

}
