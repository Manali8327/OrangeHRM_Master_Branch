package Java_programs_practice_Manali;

import java.util.Scanner;

public class methods_types {

	public void manalis_Details() {
		System.out.println("Manali Gaikwad");
		System.out.println("age = 25");
		System.out.println("id = 101");
	}
	
	public int adding_Two_numbers(int num1 , int num2) {
		int number1 = num1;
		int number2 = num2;
		int add = number1+number2;
		System.out.println("The addition of the two number is = "+(num1+num2));
		System.out.println("The updated values addition = "+add);
		return add;
	}
	
	public void adding_Two_numbers(int num1 , float num2) {
		System.out.println((num1+num2));
	}
	
	public static void ajays_Details() {
		System.out.println("ajay Gaikwad");
		System.out.println("age = 25");
		System.out.println("id = 451");
	}

	
	public static void main(String[] args) {
		System.out.println("Manali Gaikwad");
		System.out.println("age = 25");
		System.out.println("id = 101");
		System.out.println("***********************");
		methods_types ref =  new methods_types();
		ref.manalis_Details();
		int sum = ref.adding_Two_numbers(20, 36);
		int multi = sum*2;
		System.out.println(multi);
		System.out.println("***********************");
		methods_types.ajays_Details();
		System.out.println("*********///////////*********");
		Scanner scn  =  new Scanner(System.in);
		System.out.println("Enters num1");
		int num1  = scn.nextInt();
		System.out.println("Enters num2");
		int num2  = scn.nextInt();
		ref.adding_Two_numbers(num1, num2);

	}

}
