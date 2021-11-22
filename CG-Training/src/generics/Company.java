package generics;

import java.util.HashSet;

public class Company {

	public static void main(String[] args) {
		HashSet <Employee> h = new HashSet <>();
		h.add(new Employee ("Nireekshan",123,20000,"Development"));
		h.add(new Employee ("Luffy",456,20000,"One Piece"));
		h.add(new Employee ("Naruto",789,20000,"Leaf Village"));
		h.add(new Employee("Jojo",111,50000,"London"));
		h.add(new Employee("Tanjiro",222,10000,"Deamon Slayer"));
		
		
		
		Company.printHashSet(h);
	}

	private static void printHashSet(HashSet<Employee> h) {
		for(Employee temp:h) {
			System.out.println(temp);
			
		}
		
	}

}
