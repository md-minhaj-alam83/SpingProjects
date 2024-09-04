package in.min.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.min.beans.Student;

public class Main {
	
	public static void main(String [] args)
	{
		String config_loc = "/in/min/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
		
		Student std = (Student) context.getBean("stdId1");
		std.display();
		
		System.out.println("-------------------------------");
		
		Student std2 = (Student) context.getBean("stdId2");
		std2.display();
	}

}


//-----jar files----

//1. spring-beans-xxx-jar.
//2. spring-core-xxx-jar.
//3. spring-context-xxx-jar.
//4. commons-logging-xxx-jar.
//5. spring-expression-xxx-jar.