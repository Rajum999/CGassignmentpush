package lambda;

import java.util.*;

public class RemoveQ4 {
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("Nireekshan");
		l.add("Naruto");
		l.add("Luffy");
		l.add("Itadori");
		l.add("Jotaro");
		l.add("Nagato");
		System.out.println("Before using the removeIf "+l);
		l.removeIf(name->name.length()%2!=0);
		System.out.println("After using the removeIf "+l);
		
	}

}
