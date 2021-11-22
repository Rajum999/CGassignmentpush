package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class FirstLetterQ5 {
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("Nireekshan");
		l.add("Itadori");
		l.add("Naruto");
		l.add("Jotaro");
		l.add("Aomine");
		
		StringBuilder sB= new StringBuilder();
		l.forEach(s->sB.append(s.charAt(0)));
		Consumer<StringBuilder> c = i->System.out.println(i);
		c.accept(sB);
		
	}

}
