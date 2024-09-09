package in.min.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
	private String name;
	private int rollNo;
	
	@Autowired
	@Qualifier("createAddrObj2")
	private Address address;
	@Autowired
	private Subjects subjects;
	
public void display() {
		
		System.out.println("Name: "+name);
		System.out.println("RollNo: "+rollNo);
		System.out.println("Address: "+address);
		System.out.println("Subjects: "+subjects);


	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	} 

}
