package lambda;
import java.util.function.*;
public class Question3 {

	public static void main(String[] args) {
		Consumer<Integer> c= i->System.out.println(i);
		Predicate<Integer> p = i->i>10;
		Function<Integer,Integer> f = i->i*i;
		Supplier<Double> s =()->Math.random();
		c.accept(9);
		System.out.println(p.test(6));
		System.out.println(f.apply(3));
		System.out.println(s.get()*10);
		}

}
