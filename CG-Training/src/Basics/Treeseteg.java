package Basics;

import java.util.Scanner;
import java.util.TreeSet;

import generics.Employee;

public class Treeseteg {

	public static void main(String[] args) {
		//className referVar = new className();
		TreeSet<Employee> s = new TreeSet<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("choose one of the below options");
		System.out.println("1.id  2.name 3.sal 4.department");
		int choose = scanner.nextInt();
		
		
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
