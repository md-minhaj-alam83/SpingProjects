package in.min.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.min.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Student stdId1()
	{
		Student std = new Student();
		
		std.setName("Waseem");
		std.setRollNo(103);
		std.setEmail("waseem@gmai.com");
		return std;
		
    }
	
	@Bean
	public Student stdId2()
	{
		Student std = new Student();
		
		std.setName("Usmani");
		std.setRollNo(104);
		std.setEmail("usmani@gmai.com");
		return std;
		
    }

}
