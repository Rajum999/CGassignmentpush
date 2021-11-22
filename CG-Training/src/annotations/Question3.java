package annotations;

import java.lang.annotation.*;

import java.lang.reflect.*;

public class Question3 {

	public static void main(String[] args) throws Exception {
		MyClass myclass = new MyClass();
		myclass.myMethod1();
		myclass.myMethod3();
		myclass.myMethod2();
		Class c = myclass.getClass();
		Method m = c.getDeclaredMethod("myMethod1");
		Method m1 = c.getDeclaredMethod("myMethod2");
		Method m2 = c.getDeclaredMethod("myMethod3");
		Execute ann = m.getAnnotation(Execute.class);
		Execute ann1 = m1.getAnnotation(Execute.class);
		Execute ann2 = m2.getAnnotation(Execute.class);

		System.out.println(ann.sequence());
		System.out.println(ann1.sequence());
		System.out.println(ann2.sequence());

	}

}
