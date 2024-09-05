package in.min.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.min.beans.Student;

public class Main {
	
	public static void main(String[] args) {
		
		String config_loc = "/in/min/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
		
		Student std = (Student) context.getBean("student");
		std.display();
	}

}
