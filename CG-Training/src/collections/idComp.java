package collections;

import java.util.Comparator;

import generics.Employee;

public class idComp implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getId() > o2.getId()) {
			return 1;
		} else {
			return -1;
		}
	}

}

class nameComp implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}

}

class depComp implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getDepartments().compareTo(o2.getDepartments());
	}

}

class salComp implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getSal() > o2.getSal()) {
			return 1;
		} else {
			return -1;
		}

	}

}
