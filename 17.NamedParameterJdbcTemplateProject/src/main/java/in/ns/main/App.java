package in.ns.main;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import in.ns.resources.SpringConfigFile;


public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

    	NamedParameterJdbcTemplate npjdbcTemplate = context.getBean(NamedParameterJdbcTemplate.class);

    	Map<String, Object> map = new HashMap<String, Object>();
    	
    	map.put("kye_roll", 105);
    	map.put("key_name", "Waseem");
    	map.put("Key_marks", 90.0f);

    	String insert_sql_query="INSERT INTO student VALUES(:kye_roll,:key_name,:Key_marks)";
    	int count = npjdbcTemplate.update(insert_sql_query, map);
    	if (count>0)
    	{
    		System.out.println("Insertion success.");
    	}
    	else 
    	{
    		System.out.println("insertion Failed.");
    	}
    	
    
    }
}
