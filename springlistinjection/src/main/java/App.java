import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springlistinjection.model.Book;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		
		
		Book book = (Book)context.getBean("bookBean");
		book.showChapters();
		
		((ClassPathXmlApplicationContext)(context)).close();
	}
}
