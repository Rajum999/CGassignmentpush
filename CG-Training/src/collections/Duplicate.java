package collections;

import java.util.TreeSet;

public class Duplicate {

	public static void main(String[] args) {
		TreeSet<Object> t= new TreeSet<>();
		/*t.add("Nireekshan");
		t.add("Itadori");
		t.add("Kilua");
		t.add("zoro");
		t.add("Usopp");
		t.add("Jotaro");*/
		
		t.add(1);
		t.add(5);
		t.add(6);
		t.add(9);
		t.add(3);
		t.add(9);//simple ignoring the duplicate
		System.out.println(t);

	}

}
