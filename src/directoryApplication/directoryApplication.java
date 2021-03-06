package directoryApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//import java.util.Collections;
import java.util.Scanner;

class Customer{
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	private int id;
	private String name;
	private String city;
	
	Customer(int id){
		this.id = id;
	}
	
	Customer(int id, String name, String city){
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "id "+id+ "name "+name+ "city "+ city;
		
	}
	
	//overriding method equals
	@Override
	public boolean equals(Object object) {
		if(this==object) {
			return true;
		}
		
		else if(object instanceof Customer){
			Customer customer= (Customer)object;
			if(this.id==customer.id && this.name.equals(customer.name) && this.city.equals(customer.city)) {
				return true;
			}
		}
		return false;
	}
	
	
	
}

class CustomerOperations{

	private static ArrayList<Customer> customers= new ArrayList<>();
	public static void addCustomer(int id, String name, String city) {
		// TODO Auto-generated method stub
		Customer customer= new Customer(id,name,city);
		customers.add(customer);		
	}
	
	public static ArrayList<Customer> getCustomers() {
		return customers;
	}

	public static String search(int id1, String name1, String city1) {
		// TODO Auto-generated method stub
		
		Customer customer= new Customer(id1,name1,city1);
		return customers.contains(customer)?"found":"not found";
		
	}

	public static void sort() {
		// TODO Auto-generated method stub
		Collections.sort(customers,new Comparator<Customer>() {

			@Override
			public int compare(Customer o1, Customer o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
				
			}
			
			
		});
		
	}
	
}
public class directoryApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		peeking inside the javacode to understand things
//		ArrayList<String> l= new ArrayList<>();
//		l.add("nik");
//		l.add("sid");
//		l.add("don");
//		
//		System.out.println(l);
////		Collections.sort(l);
//		l.sort();
//		System.out.println(l);
//		System.out.println(l.contains("nik")?"found":"not found");
//		l.remove("sid");
//		System.out.println(l);
		
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.println("1. Add a Customer");
			System.out.println("2. Search a Customer");
			System.out.println("3. Print");
			System.out.println("4. Update a Customer");
			System.out.println("5. Sort  Customers");
			System.out.println("6. Count Customers");
			System.out.println("7. Total Balance of All Customers");
			System.out.println("8 . Delete a Customer");
			System.out.println("9 . exit");
			int choice = s.nextInt();
			switch(choice){
			case 1:
				System.out.println("Enter the Id ");
				int id = s.nextInt();
				System.out.println("Enter the Name");
				String name = s.next();
				System.out.println("Enter the City");
				String city = s.next();
				CustomerOperations.addCustomer(id, name, city);
				break;
			case 2:
				System.out.println("Enter the Id ");
				int id1 = s.nextInt();
				System.out.println("Enter the Name");
				String name1 = s.next();
				System.out.println("Enter the City");
				String city1 = s.next();
				System.out.println(CustomerOperations.search(id1, name1, city1));
				break;
			case 5:
				CustomerOperations.sort();
				System.out.println(CustomerOperations.getCustomers());
				break;

			case 3:
				System.out.println(CustomerOperations.getCustomers());
				break;
			}
			
		}
		
		

	}

}
