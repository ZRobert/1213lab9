//Robert Payne
//ITCS 1213-01-L02
//6-14-2012
//Task 3
import java.util.Scanner;

public class CustomerDemo
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Customer custOne = new Customer();
		
		//Variable declarations
		String name;
		String address;
		String phone;
		
		System.out.println("Enter a name for customer 1: ");
		name = keyboard.nextLine();
		
		System.out.println("Enter the address for customer 1: ");
		address = keyboard.nextLine();
		
		System.out.println("Enter the phone number for customer 1: ");
		phone = keyboard.nextLine();
		
		custOne.setName(name);
		custOne.setAddress(address);
		custOne.setPhone(phone);
		
		System.out.println(custOne.toString());
		
		//Getting infomation for Customer 2
		/*
		System.out.println("Enter a name for customer 2: ");
		name = keyboard.nextLine();
		
		System.out.println("Enter the address for customer 2: ");
		address = keyboard.nextLine();
		
		System.out.println("Enter the phone number for customer 2: ");
		phone = keyboard.nextLine();
		*/
		//Customer 2 object
		Customer custTwo = new Customer("Edison", "900 Not Awesome St", "123-4567");
		
		System.out.println(custTwo.toString());
		
		custTwo.changeOnMailingList();
		
		System.out.println(custTwo.toString());
		
		Customer custThree = new Customer("Tesla", "123 Awesome Dr", "555-5555", false);
		
		System.out.println(custThree.toString());
		
		
		
		
		
		
	}
}