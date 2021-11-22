package collections;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class DateOfBirth {

	public static void main(String[] args) {
		List<LocalDate> list = new LinkedList<>();
		list.add(LocalDate.of(1999, Month.AUGUST, 6));
		list.add(LocalDate.of(2000, Month.AUGUST, 4));
		list.add(LocalDate.of(2001, Month.APRIL, 1));
		list.add(LocalDate.of(2002, Month.DECEMBER, 23));
		list.add(LocalDate.of(2003, Month.JANUARY, 13));
		list.add(LocalDate.of(2005, Month.MAY, 25));
		list.add(LocalDate.of(2004, Month.AUGUST, 6));
		
		for(LocalDate temp:list) {
			if(temp.isLeapYear()) {
				System.out.println("Your Date of Birth is "+temp+" is in leapYear");
				
			}
			else {
				System.out.println("Your Date of Birth is "+temp+" is not in leapYear");
			}
			
		}
	}

}
