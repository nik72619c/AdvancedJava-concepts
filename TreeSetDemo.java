package Collections;

import java.util.TreeSet;
class Customer1 implements Comparable<Customer1>{
	private int id;
	private String name;
	
	public Customer1(int id, String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "id:-"+this.id+" name:-"+this.name;
	}
	@Override
	public int compareTo(Customer1 object) {
		return ((Integer)this.id).compareTo(object.id);
	}
}

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> treeset=new TreeSet<>();
		//treeset.add(null); not allowed as NullPointerException occurs
		treeset.add("nik");
		treeset.add("sid");
		treeset.add("alok");
		System.out.println(treeset);  
		Customer1 customer = new Customer1(1, "nikhil");
		TreeSet<Customer1> customers=new TreeSet<>();
		customers.add(customer);
		System.out.println(customers.contains(customer));		
	}

}
