package annotations;

import java.lang.annotation.*;

@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Info {
	int AuthorID() default 0;
	String Date() default "none";
	String Time() default "none";
	int Version()default 0;
	

}
