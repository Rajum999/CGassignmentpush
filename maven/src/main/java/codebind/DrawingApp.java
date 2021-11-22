package codebind;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {
	public static void main(String[] args) throws Exception{
		//Triangle triangle = new Triangle();
		AbstractApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
	
		//BeanFactory factory = new XmlBeanFactory(new ClassPathResource("triangle.xml"));
		//factory.registerShutdownHook();
		
		//Triangle triangle =(Triangle) factory.getBean("triangle");
		//triangle.draw();
		Shape shape = (Shape) factory.getBean("circle");
		shape.draw();
		
		
		
	}

}
