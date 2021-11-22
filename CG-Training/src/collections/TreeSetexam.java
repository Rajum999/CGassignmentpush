package collections;

import java.util.*;


import generics.Employee;

public class TreeSetexam {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose the following options in which manner you need to sort");
		System.out.println("1.name  2.id  3.salary   4.department");
		int choose = scanner.nextInt();
		//char choose = scanner.next().charAt(0);
		Set<Employee> s = null;
		if(choose == 1) {
			s = new TreeSet<>(new nameComp());	
		}
		else if(choose == 2) {
			s = new TreeSet<>(new idComp());
		}
		else if(choose == 3) {
			s = new TreeSet<>(new salComp());
		}
		else if(choose == 4) {
			s = new TreeSet<>(new depComp());
		}
		s.add(new Employee ("Nireekshan",123,50000,"Development"));
		s.add(new Employee ("Luffy",456,60000,"One Piece"));
		s.add(new Employee ("Naruto",789,30000,"Leaf Village"));
		s.add(new Employee("Jojo",111,90000,"London"));
		s.add(new Employee("Tanjiro",222,10000,"Deamon Slayer"));
		for(Employee temp:s) {
			System.out.println(temp);
			
		}

	}

}


