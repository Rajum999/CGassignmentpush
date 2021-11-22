package streams;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		List<Fruit> l = Arrays.asList(new Fruit("Gomu Gomu no Mi", 500,100000,"Blue"),
		new Fruit("Mera Mera no Mi", 50,50000,"Yellow"),
		new Fruit("Op Op no Mi", 300,300000,"Red"),
		new Fruit("Goro Goro no Mi ", 700,10000,"White"),
		new Fruit("Mochi Mochi no Mi", 400,400000,"Red"),
		new Fruit("Yami Yami no Mi", 10,100,"Black"));
		Predicate<Fruit> p = e ->e.calories<100;
		Predicate<Fruit> p1 = c ->c.color=="Red";
		
		Comparator<Fruit> c = (s1,s2) ->{
			int l1=s1.calories;
			int l2 = s2.calories;
			if(l1<l2) return 1;
			else if(l1>l2) return -1;
			else return 0;
		};
		Comparator<Fruit> c1 = (s1,s2) ->{
			String l3=s1.name;
			String l4 = s2.name;
			return (l3.compareTo(l4));
		};
		Comparator<Fruit> price = (pr1,pr2) ->{
			int rp1 =pr1.price;
			int rp2 = pr2.price;
			if(rp1<rp2) return -1;
			else if(rp1>rp2) return 1;
			else return 0;
		};
		
		List<Fruit> sortedList = l.stream().filter(p).sorted(c).collect(Collectors.toList());
		sortedList.forEach(System.out::println);
		System.out.println("***********************");
		
		List<Fruit> sortedList1 = l.stream().sorted(c1).collect(Collectors.toList());
		sortedList1.forEach(System.out::println);
		System.out.println("***********************");
		
		List<Fruit> sL = l.stream().filter(p1).sorted(price).collect(Collectors.toList());
		sL.forEach(System.out::println);
		
	}
}
