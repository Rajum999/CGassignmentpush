package streams;

import java.util.Arrays;
import java.util.*;

public class NewsBasedQ {
	public static void main(String[] args) {
		List<News> list = Arrays.asList(
		new News(1,"Doflamingo","Law","According to Article 112 of the Indian Constitution, the Union Budget of a year, also referred to as the annual financial statement, is a statement of the estimated receipts and expenditure of the government for that particular year"),
		new News(2,"Oden","Kaido","Revenue budget includes the government's revenue receipts and expenditure. There are two kinds of revenue receipts - tax and non-tax revenue."),
		new News(3,"Linlin","Luffy","Revenue expenditure is the expenditure incurred on day to day functioning of the government and on various services offered to citizens."),
		new News(4,"Jumbe","SunPirate","If revenue expenditure exceeds revenue receipts, the government incurs a revenue deficit."),
		new News(5,"Marco","Marshal D Teach","Union Budget is classified into Revenue Budget and Capital Budget.")
		);
		
		long i= list.stream().map(x->x.comment).count();
		System.out.println(i);
	}

}
