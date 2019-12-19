package serviceinjection.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import serviceinjection.model.Student;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("beanConfiguration.xml");
		
		Student student = (Student)context.getBean("studentBean");
		student.showStudentMessage();
		
		((ClassPathXmlApplicationContext)(context)).close();
	}
}
