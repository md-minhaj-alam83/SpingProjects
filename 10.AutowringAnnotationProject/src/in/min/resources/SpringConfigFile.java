package in.min.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.min.beans.Address;
import in.min.beans.Student;
import in.min.beans.Subjects;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address createAddrObj() {
		
		Address addr = new Address();
		addr.setHouseNo(137);
		addr.setCity("Purnia");
		addr.setPinCode(854326);
		
		return addr;
	} 
	
	@Bean
	public Subjects createSubObj() {
		
		Subjects subj = new Subjects();
		
		List<String> subjectList = new ArrayList<String>();
		
		subjectList.add("Java");
		subjectList.add("Spring");
		subjectList.add("Sql");
		
		subj.setSubjects(subjectList);

		
		return subj;
	}
	
	@Bean
	public Student createStdObj() {
		
		Student std = new Student();
		std.setName("Minhaj");
		std.setRollNo(101);
//		std.setAddress(createAddrObj());   //---Manually Dependency injection
		
		return std;
	}

}
