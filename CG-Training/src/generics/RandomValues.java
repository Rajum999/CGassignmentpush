package generics;

import java.util.HashMap;

public class RandomValues <K,P>{

	public static void main(String[] args) {
		HashMap<Integer,Double> hM= new HashMap<> (); 
		hM.put(1, 1.0);
		hM.put(5, 2.0);
		hM.put(6, 1.0);
		hM.put(4, 3.0);
		hM.put(2, 4.0);
		hM.put(3, 5.0);
		hM.put(7, 6.0);
		hM.put(8, 7.0);
		hM.put(9, 8.0);
		hM.put(10, 9.0);
		System.out.println(hM);
		

	}

}
