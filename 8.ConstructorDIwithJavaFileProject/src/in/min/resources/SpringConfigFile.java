package in.min.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.min.beans.Address;
import in.min.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address createAddrObj() {
		
		Address addr = new Address(137,"Purnia",854326);
		
		return addr;
	} 
	
	@Bean
	public Student createStdObj() {
		
		Student std = new Student("Minhaj",101,createAddrObj());
		
		return std;
	}

}
