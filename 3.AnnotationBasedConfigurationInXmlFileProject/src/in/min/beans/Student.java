package in.min.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("Minhaj")
	private String name;
	@Value("001")
	private int roll;
	@Value("99.99f")
	private float marks;
	
	
	public void display()
	{
		System.out.println("Name:"+name);
		System.out.println("RollNo:"+roll);
		System.out.println("Marks:"+marks);

	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}

}

