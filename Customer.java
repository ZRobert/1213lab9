//Robert Payne
//ITCS 1213-01-L02
//6-14-2012
//Task 2

public class Customer extends Person{
	//Fields
	private static int currentNumber;
	private boolean onMailingList;
	private int customerNumber;

	//Constructor
	public Customer()
	{
		super();
		onMailingList = false;
		customerNumber = currentNumber;
		currentNumber++;
	}
	
	public Customer(String name)
	{
		super(name);
		onMailingList = false;
		customerNumber = currentNumber;
		currentNumber++;
	}
	
	public Customer(String name, String address)
	{
		super(name, address);
		onMailingList = true;
		customerNumber = currentNumber;
		currentNumber++;
	}
	
	public Customer(String name, String address, String phone)
	{
		super(name, address, phone);
		onMailingList = true;
		customerNumber = currentNumber;
		currentNumber++;
	}
	
	public Customer(String name, String address, String phone, boolean onMailingList)
	{
		super(name, address, phone);
		this.onMailingList = onMailingList;
		customerNumber = currentNumber;
		currentNumber++;
	}

	//Accessor methods
	public int getCustomerNumber()
	{
		return customerNumber;
	}
	
	public boolean getOnMailingList()
	{
		return onMailingList;
	}
	
	//Mutator
	public void changeOnMailingList()
	{
		onMailingList = !onMailingList;
	}
	
	public String toString()
	{
		return "Customer Number: " + customerNumber + "\nName: " + super.getName() + "\nAddress: " + super.getAddress() +
				"\nPhone #: "+ super.getPhone() + "\nOn Mailing List? " + onMailingList;
	}
}		

	 