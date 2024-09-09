package in.min.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.min.beans.Student;
import in.min.resources.SpringConfigFile;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		Student std= context.getBean(Student.class);
		std.display();
	}

}
