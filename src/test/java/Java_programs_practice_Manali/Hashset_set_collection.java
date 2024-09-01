package Java_programs_practice_Manali;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class Hashset_set_collection {

	public static void main(String[] args) {
		Set set =  new HashSet();
		set.add(10);
		set.add("Ajay");
		set.add(null);
		set.add("Ajay");
		set.add("id");
		System.out.println(set);
		for(Object obj : set) {
			System.out.println(obj);
		}
		System.out.println("************");
	    Iterator itr = set.iterator();
	     while(itr.hasNext()) {
	    	 System.out.println(itr.next());
	     }
         
  }
}