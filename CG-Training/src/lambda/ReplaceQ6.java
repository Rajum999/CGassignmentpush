package lambda;

import java.util.ArrayList;
import java.util.List;

public class ReplaceQ6 {
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("nireekshan");
		l.add("itadori");
		l.add("naruto");
		l.add("jotaro");
		l.add("aomine");
		l.replaceAll(s->s.toUpperCase());
		System.out.println(l);
	}

}
