package in.narrowitsolution.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.narrowitsolution.beans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String config_path="/in/narrowitsolution/resources/applicationContext.xml";
    	ApplicationContext context = new ClassPathXmlApplicationContext(config_path);
    	
    	Student std = context.getBean(Student.class);
    	std.display();
    }
}
