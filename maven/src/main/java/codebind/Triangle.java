package codebind;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements Shape {
	private Point point1;
	private Point point2;
	private Point point3;
	private ApplicationContext factory=null;

	public Point getPoint1() {
		return point1;
	}

	public void setPoint1(Point point1) {
		this.point1 = point1;
	}

	public Point getPoint2() {
		return point2;
	}

	public void setPoint2(Point point2) {
		this.point2 = point2;
	}

	public Point getPoint3() {
		return point3;
	}

	public void setPoint3(Point point3) {
		this.point3 = point3;
	}

	public void draw() {
		System.out.println("Drawn triangle");
		System.out.println("point A = (" + getPoint1().getX() + "," + getPoint1().getY() + ")");
		System.out.println("point B = (" + getPoint2().getX() + "," + getPoint2().getY() + ")");
		System.out.println("point C = (" + getPoint3().getX() + "," + getPoint3().getY() + ")");
	}

	/*
	 * public void destroy() throws Exception { System.out.println("from destroy");
	 * 
	 * }
	 * 
	 * public void afterPropertiesSet() throws Exception {
	 * System.out.println("from the init");
	 * 
	 * }
	 */

	/*
	 * public void setApplicationContext(ApplicationContext factory) throws
	 * BeansException { this.setFactory(factory);
	 * 
	 * }
	 * 
	 * public ApplicationContext getFactory() { return factory; }
	 * 
	 * public void setFactory(ApplicationContext factory) { this.factory = factory;
	 * }
	 * 
	 * public void setBeanName(String beanName) {
	 * System.out.println("The bean name is :"+ beanName);
	 * 
	 * }
	 */
	
	/*
	public void myInit() {
		System.out.println("Started the initmethod");
	}
	
	public void myClose() {
		System.out.println("Closed the init");
	}*/
}
