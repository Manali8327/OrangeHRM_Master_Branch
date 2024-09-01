package Java_programs_practice_Manali;

import java.util.Scanner;

public class loops_java {
	
	public void age_Criteria(int age) {
		if(age>=18) {
			System.out.println("permission granted");
		}else{
			System.out.println("not allowed in club");
		}
	}
	
	public void for_loops(int num) {
		int count=0;
		for(int i=0;i<num;++i) {
			System.out.println("Hi manali");
			count++;
			System.out.println(count);
		}
		System.out.println(count);
	}
		
	public void printStringchars(String userdefine) {
		int count=0;
		char[] array = {'a','j','a','y'}; 
		char[] ary  = userdefine.toCharArray();
		for(int i=0;i<ary.length;i++) {
			System.out.println("char at position "+"["+i+"]"+" = "+ary[i]);
		}
		System.out.println("******************");
		for(int j=0;j<userdefine.length();j++) {
			System.out.println("char at position "+"["+j+"]"+" = "+userdefine.charAt(j));
		}
		System.out.println("******************");
		for(char user:array) {
			System.out.println("char at position "+"["+count+"] = "+user);
			count++;
		}
		//for( LHS = array | collection)
		System.out.println("******************");
		for(char user:userdefine.toCharArray()) {
			System.out.println("char at position "+"["+count+"] = "+user);
			count++;
		}
	}
	
	public void whileloops(String userdefine)
	{   int i=0;
		while(i<userdefine.length()) {
			System.out.println("hii manali");
			System.out.println(userdefine.charAt(i));
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
	/*	System.out.println("Enter the valid number ");
		int age = scn.nextInt();
		loops_java ref = new loops_java();
		ref.age_Criteria(age);
		System.out.println("Enter the valid number greater than 0");
		int for_loopcount = scn.nextInt();
		ref.for_loops(for_loopcount);
	*/	
		loops_java ref = new loops_java();
		System.out.println("Enter the valid string ");
		String user_define = scn.nextLine();
		ref.printStringchars(user_define);
		ref.whileloops(user_define);

	}
}
