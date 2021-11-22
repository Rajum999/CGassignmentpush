package lambda;

import java.util.*;
import java.util.function.*;

public class PrintQ8 {
	public static void main(String[] args) {
		Runnable r =()->{
			for(int i=0;i<=9;i++){
				System.out.println("From child Thread");
			}
		};
		Thread t = new Thread(r);
		t.start();
		for(int i =0;i<10;i++) {
			System.out.println("From the Main Thread "+i);
		}
	}

	
		
	

	
}

