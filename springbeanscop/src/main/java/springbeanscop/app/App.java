package springbeanscop.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springbeanscop.model.Shape;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("beans.xml");
		//Ctrl + 2 ... L
		Shape shape1 = (Shape)context.getBean("shapeBean");
		//student.showMessage();
		Shape shape2 = (Shape)context.getBean("shapeBean");
		
		((ClassPathXmlApplicationContext)(context)).close();
		
	}
}
