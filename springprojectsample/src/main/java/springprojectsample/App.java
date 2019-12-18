package springprojectsample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("mybeans.xml");
		//Ctrl + 2 ... L
		Student student = (Student)context.getBean("studentBean");
		//student.showMessage();
		
		student.showStudentCar();
		
		((ClassPathXmlApplicationContext)(context)).close();
		
	}
}
