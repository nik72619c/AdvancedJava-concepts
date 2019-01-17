package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class mapDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map< String,Integer> hm =  
                 new HashMap< String,Integer>(); 
hm.put("a", 100); 
hm.put("b", 200); 
hm.put("c", 300); 
hm.put("d", 400); 
System.out.println(hm);

Iterator<String> iterator = hm.keySet().iterator();
while(iterator.hasNext()){
  Object key   = iterator.next();
  Object value = hm.get(key);
}

Set entries = hm.entrySet();
Iterator itr = entries.iterator();
while(iterator.hasNext()) {
    Map.Entry entry = (Map.Entry) itr.next();
    Object key = entry.getKey();
    Object value = entry.getValue();
}

	}

}
