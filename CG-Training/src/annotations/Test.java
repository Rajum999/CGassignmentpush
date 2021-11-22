package annotations;

import java.lang.annotation.*;
@Inherited
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test{
		String testCase();
}


