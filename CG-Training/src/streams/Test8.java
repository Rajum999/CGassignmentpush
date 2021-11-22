package streams;

import java.util.stream.Collectors;
import java.util.*;

public class Test8 {
	public static void main(String[] args) {
		List<Transaction> list = Arrays.asList(
				new Transaction(new Trader("Lucifer","Pune"),2011,10000),
				new Transaction(new Trader("John snow","Indore"),2005,20000),
				new Transaction(new Trader("Ashur","Delhi"),2010,40000),
				new Transaction(new Trader("Tribiayni","lA"),2011,30000),
				new Transaction(new Trader("Chandler","USA"),2000,10000),
				new Transaction(new Trader("Asta","FlowerCapital"),2011,60000)
				);
		//8th
		List<Integer> sortedList=list.stream().filter(i->i.year==2011).map(x->x.value).sorted().collect(Collectors.toList());
			sortedList.forEach(System.out::println);
		System.out.println("*********************************");	
		//9th
		/*List<Transaction> city =list.stream().distinct().collect(Collectors.toList());
		city.forEach(System.out::println);*/
		list.stream().distinct().forEach(System.out::println);
		System.out.println("******************************");
		
		//10th
		list.stream().filter(i->i.trader.city=="Pune").sorted().forEach(System.out::println);
		System.out.println("*************************************");
		
		//11th
		list.stream().map(x->x.trader.name).sorted().forEach(System.out::println);
		System.out.println("************************************");
		
		//12th
		list.stream().filter(x->x.trader.city.contains("Indore")).map(x->x.trader).forEach(System.out::println);
		System.out.println("***********************************");
		
		//13th
		list.stream().filter(x->x.trader.city=="Delhi").map(x->x.value).forEach(System.out::println);
		System.out.println("*************************************");
		
		//14th
		Integer max =list.stream().map(x->x.value).max((i,j)->i.compareTo(j)).get();
		System.out.println("The maximum valued Transaction "+max);
		
		//15th
		Integer min =list.stream().map(x->x.value).min((i,j)->i.compareTo(j)).get();
		System.out.println("The minimum valued transaction "+min);
	}

}
