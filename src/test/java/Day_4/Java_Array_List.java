package Day_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Java_Array_List {

	public static void main(String[] args) {
		List list1 = new ArrayList();
		
		list1.add("id");
		list1.add(101);
		list1.add("Name");
		list1.add("abc");
		list1.add(null);
		list1.add("Age Above 18");
		list1.add("True");
		
		System.out.println("list 1 is "+list1);
		for (Object i : list1) {
             System.out.print(i+","+"\n");
		}
		
		System.out.println("List value at Position 3 : "+list1.get(2));
		System.out.println("List Null Value Exist : "+list1.contains(null));
		System.out.println("the index of id is "+list1.lastIndexOf("Age Above 18"));
		
		System.out.println("Is List 1 Empty : "+list1.isEmpty());
		
		List list2 = new ArrayList();
		System.out.println("Is List 2 Empty : "+list2.isEmpty());
		
		list2.addAll(list1);
		System.out.println("\nlist 2 is "+list2);
		list2.add(5,"abc");
		System.out.println("list 2 after adding element at 5th Position : ");
		Iterator itr = list2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()); 
		}
			
		System.out.println(list2.lastIndexOf(itr));
		
		System.out.println("SubString of List 2 from index 2 to 4 : "+list2.subList(2, 4));
		
		System.out.println("Size of List 2 : "+list2.size());
		
		//System.out.println(list2.sort(null));
		Collections.sort(list2);
		Iterator itw = list2.iterator();
		while(itw.hasNext()) {
			System.out.println(itw.next()); 
		}
		/*	List<Integer> list3 = new ArrayList<Integer>();
		System.out.println("\nEnter the list size : ");
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		System.out.println("Enter Data to add in list : ");
		for(int i=0;i<size;i++){  
			int j=scn.nextInt();
	        list3.add(j);
		}
		
		System.out.println("\nList 3 is : ");
		Iterator ite = list3.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next()); 
		}
	*/
	}

}
