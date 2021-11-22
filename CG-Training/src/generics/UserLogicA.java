package generics;

public class UserLogicA {

	public static void main(String[] args) {
		Pair<String, String> p = new Pair<>("raju", "aaa");
		System.out.println(p.toString());
		p.setKey("Nireekshan");
		p.setValue("456");
		System.out.println(p.toString());
		
		Pair<String ,java.util.Date> p1 = new Pair<>("Today is",(new java.util.Date()));
		System.out.println(p1.toString());

	}

}
