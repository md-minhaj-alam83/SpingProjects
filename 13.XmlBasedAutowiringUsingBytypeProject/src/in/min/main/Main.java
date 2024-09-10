package in.min.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.min.beans.Student;

public class Main {
	
	public static void main(String[] args) {
		
		String Config_path = "/in/min/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(Config_path);
		
		Student std = (Student) context.getBean("stdId");
		std.display();
	}

}
