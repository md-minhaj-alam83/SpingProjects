package in.min.resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("in.min.beans")
//@ComponentScan({"in.min.beans"})--------u can use anyone of them
@ComponentScan(basePackages = {"in.min.beans"})
public class SpringConfigFile {

}
