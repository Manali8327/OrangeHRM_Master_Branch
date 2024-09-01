package Day_1;

import java.util.Scanner;

public class Java_Methods {
	
	//Method with no parameter
	public void Addition() {
		int num1 = 10;
		int num2 = 35;
		System.out.println("Addition of two numbers = "+(num1+num2));
	}
	
	//Method with parameter
	public static void substraction(int num1, int num2) {
		Java_Methods ref = new Java_Methods();
		ref.Addition();
		int sub = num1-num2;
		System.out.println("Substraction of 2 Numbers = "+sub);
	}
	
	//Method with parameters and return type
	public float substraction(float num1, float num2, float num3) {
		float total = num1-num2-num3;
		System.out.println("Substraction of 3 Numbers = "+total);
		return total;	
	}

	public static void main(String[] args) {
		System.out.println("Java Methods");
		System.out.println("Enter two Values");
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter first value = ");
		int val1 = scn.nextInt(); 
		System.out.println("Enter second value = ");
		int val2 = scn.nextInt();
		System.out.println("***************************");
		
		//Accessing Static method directly by assing user input
		Java_Methods.substraction(val1, val2);
		
		System.out.println("***************************");
		//Accessing All Methods using Object without user input
		Java_Methods jvm = new Java_Methods();
		jvm.Addition();
		System.out.println("***************************");
		jvm.substraction(6888, 9374);
		System.out.println("***************************");
		float value = jvm.substraction(55.0f, 4.5f, 45.9f);
		value = value/100;
		System.out.println("Total value / 100 = "+value);
	}

}
