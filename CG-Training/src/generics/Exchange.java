package generics;
import java.util.Arrays;

public class Exchange {

	public static void main(String[] args) {
		
		int temp;
		int [] i = {1,2,3,4};
		System.out.println("Array before swapping "+Arrays.toString(i));
		temp = i[0];
		i[0] =i[1];
		i[1]=temp;
		
		System.out.println("Array after the swapping"+Arrays.toString(i));
		
		
		
	}

}
