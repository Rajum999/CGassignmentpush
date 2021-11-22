package annotations;
import java.lang.annotation.*;

@Inherited
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

public @interface Execute {
	int sequence() default 0;

}
