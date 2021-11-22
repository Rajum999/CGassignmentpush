package collections;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		
		Map<Long,Contact> tM = new TreeMap<>();
		tM.put(987654321l,new Contact(999999l,"Nireekshan","Nireekshan@gmail.com",Gender.male));
		tM.put(887654321l,new Contact(888888l,"Raju","Nireekshan@gmail.com",Gender.male));
		tM.put(787654321l,new Contact(777777l,"Luffy","Nireekshan@gmail.com",Gender.male));
		tM.put(687654321l,new Contact(666666l,"Zoro","Nireekshan@gmail.com",Gender.male));
		tM.put(587654321l,new Contact(555555l,"Sanji","Nireekshan@gmail.com",Gender.male));
		for(Long key:tM.keySet()) {
			System.out.println("The keys for the TreeMap "+key);	
		}
		System.out.println("*******************************************************");
		for(Contact values:tM.values()) {
			System.out.println("The values for the TreeMap "+values);
		}
		System.out.println("*******************************************************");
		System.out.println(tM);
		
	}

	

}
