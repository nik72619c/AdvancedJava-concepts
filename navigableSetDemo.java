package Collections;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class navigableSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigableSet<Integer> navset= new TreeSet<>();
		navset.add(1);
		navset.add(2);
		navset.add(3);
		navset.add(4);
		navset.add(7);
		navset.add(6);
		navset.add(5);
//		navset.add(6);
		System.out.println(navset);   //elements in sorted order as it implements SortedSet Interface
		NavigableSet<Integer> reverse=navset.descendingSet();
		System.out.println(navset); 
		Iterator iterator= navset.descendingIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println(navset.headSet(4,true));
		System.out.println(navset.lower(4));
		System.out.println(navset.higher(4));
		System.out.println(navset.floor(4));
		

	}

}
