package in.min.beans;

public class Address {
	
	private int houseNo;
	private String city;
	private int pinCode;
	
	
	public Address(int houseNo,String city,int pinCode)
	{
		this.houseNo=houseNo;
		this.city=city;
		this.pinCode=pinCode;
		
	}
	
	@Override
	public String toString() {
		return "HouseNo-->"+houseNo+" City-->"+city+"  PinCode-->"+pinCode;
	
	}

}
