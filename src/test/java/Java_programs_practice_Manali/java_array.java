package Java_programs_practice_Manali;

import java.util.Scanner;

public class java_array {

	
	public void array_travel(int[] arr) {
		System.out.println("iam in the array");
		for(int i:arr) {
			System.out.println("array value is "+"["+i+"]"  );
		}
	}
	
	
	public static void main(String[] args) {
	/*	Scanner scn = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = scn.nextInt();
		int[] age= new int[size];
		System.out.println("Enter Array Value");
		for( int i=0;i<size;i++) {
			age[i] = scn.nextInt();
		}*/
		java_array ref = new java_array();
		//ref.array_travel(age);
		System.out.println(ref.toString());
		System.out.println(ref.hashCode());
		java_array ger = new java_array();
		System.out.println(ger.toString());
		System.out.println(ger.hashCode());
		char ch[] = {'a','b','c','d'};
				String manali_name = "manwadkar";
		
		String ajay_name = new String("aajaygaikwad");
		String char_represent = new String(ch);
	}
	

}
