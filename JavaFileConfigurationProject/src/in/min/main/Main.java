package in.min.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.min.beans.Student;
import in.min.resources.SpringConfigFile;

public class Main {
	
	public static void main(String [] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		Student std= (Student) context.getBean("stdId1");
		std.display();
		
//		Student std= (Student) context.getBean(Student.class);
//		std.display();
	
		System.out.println("--------------------");
		
		Student std2= (Student) context.getBean("stdId2");
		std.display();
	
	}

	
	

}
