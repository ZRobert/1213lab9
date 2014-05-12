//Robert Payne
//ITCS 1213-01-L02
//6-14-2012
//Task 1

public class Person{
	//Fields
	private String name;
	private String address;
	private String phone;
	
	//Constructors
	public Person()
	{
		
	}
	
	public Person(String name)
	{
		this.name = name;
	}
	
	public Person(String name, String address)
	{
		this.name = name;
		this.address = address;
	}
	
	public Person(String name, String address, String phone)
	{
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	//Accessor Methods
	public String getName()
	{
		return name;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public String getPhone()
	{
		return phone;
	}
	
	//Mutator methods
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
}