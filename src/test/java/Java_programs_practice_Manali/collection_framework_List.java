package Java_programs_practice_Manali;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class collection_framework_List {

	public static void main(String[] args) {
		//list ----> List is Interface its implements Linkedlist,Arraylist,Vector
		//Declaration 
		List list = new ArrayList();
		
		list.add("Ajay");
		list.add("id");
		list.add(202);
		list.add("salary");
		list.add(85000.450f);
		list.add(null);
		list.add(true);
		list.add("Ajay");
		list.add("Vijay");
		System.out.println("list is "+list);
		for (Object obj : list) {
             System.out.print(obj+","+"\n");
		}
		
		System.out.println("value at 1st position = "+list.get(1));
		list.add(0, "rahul");
		System.out.println(list);
		list.set(0, "raaj");
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		
		System.out.println("Is that in my list is there any null value = "+list.contains(null));
		System.out.println("The list is empty or not = "+list.isEmpty());
		System.out.println("the index of id is "+list.lastIndexOf("id"));
		
		List<Integer> list_strng = new ArrayList<Integer>();
		list_strng.add(10);
		System.out.println(list_strng);
		
		list_strng.addAll(list);
		System.out.println(list_strng);
		Iterator itr = list_strng.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()); 
		}

	}

}
