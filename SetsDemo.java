package directoryApplication;

import java.util.HashSet;
import java.util.Set;

class Emp{
	
	int id;
	String name;
	public Emp(int id, String name) {
		this.id=id;
		this.name=name;
		
	}
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
	@Override
	   public boolean equals(Object o) {
		if(o==null || !(o instanceof Emp)) {
			return false;
		}
		Emp obj=(Emp)o;
		return (this.id==obj.id && this.name==obj.name);
	}
	@Override
	public int hashCode() {
		return this.getId();
	}
	
	@Override
	public String toString(){
		return "{"+id+","+name+"}";
	}
}



public class SetsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Emp> set= new HashSet<>();
		set.add(new Emp(1,"nikhil"));
		set.add(new Emp(1,"nikhil"));
		set.add(new Emp(2,"sam"));
		System.out.println(set);

	}

}
