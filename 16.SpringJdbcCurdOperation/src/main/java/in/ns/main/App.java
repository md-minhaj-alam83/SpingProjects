package in.ns.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.ns.beans.Student;
import in.ns.mappers.StudentRowMapper;
import in.ns.resources.SpringConfigFile;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

		// ------------insert operation---------
//    	int std_roll= 103;
//    	String std_name="Uzair";
//    	float std_marks=95.00f;
//    	
//    	String insert_sql_query="INSERT INTO student VALUES(?,?,?)";
//    	int count=jdbcTemplate.update(insert_sql_query, std_roll, std_name, std_marks);
//    	
//    	if (count>0)
//    	{
//    		System.out.println("insertion success.");
//    	}
//    	else 
//    	{
//    		System.out.println("insertion failed.");
//    	}

		// ----------update operation---------
//    	float marks=95.0f;
//    	int rollno = 102;
//    	String update_sql_query="UPDATE student SET std_marks=? where std_roll=?";
//    	int count=jdbcTemplate.update(update_sql_query,marks,rollno);
//    	if(count>0)
//    	{
//    		System.out.println("updation success.");
//    	}
//    	else 
//    		System.out.println("updation failed.");

		// -------delete opertaion------
//    	
//    	int rollno = 102;
//    	String delete_sql_query="DELETE FROM student WHERE std_roll=?";
//    	int count= jdbcTemplate.update(delete_sql_query,rollno);
//    	if (count>0)
//    	{
//    		System.out.println("Deletaion success.");
//    	}
//    	else 
//    		System.out.println("Deletation failed.");

		// -----------select operation 1------

//    	String select_sql_query="SELECT * FROM student";
//    	List<Student> stdList=jdbcTemplate.query(select_sql_query, new StudentRowMapper());
//    	for(Student std : stdList)
//    	{
//    		System.out.println("Name : "+std.getName());
//    		System.out.println("RollNo : "+std.getRollNo());
//    		System.out.println("Marks : "+std.getMarks());
//    		System.out.println("--------------------------------------");
//
//
//    	}

		// -----------select operation 2------

//		int rollno = 101;
//		String select_sql_query = "SELECT * FROM student WHERE std_roll=?";
//		List<Student> stdList = jdbcTemplate.query(select_sql_query, new StudentRowMapper(), rollno);
//		for (Student std : stdList) {
//			System.out.println("Name : " + std.getName());
//			System.out.println("RollNo : " + std.getRollNo());
//			System.out.println("Marks : " + std.getMarks());
//			System.out.println("--------------------------------------");
//
//		}

		// ------select opertaion 3-----------

		int rollno = 103;
		String select_sql_query = "SELECT * FROM student WHERE std_roll=?";
		Student  stdList = jdbcTemplate.queryForObject(select_sql_query, new StudentRowMapper(), rollno);
			System.out.println("Name : " + stdList.getName());
			System.out.println("RollNo : " + stdList.getRollNo());
			System.out.println("Marks : " + stdList.getMarks());
			System.out.println("--------------------------------------");

		

	}
}
