package Day_2;

import java.util.Scanner;

public class Java_Switch_Case {
	
	public void calculator(int ch, int num1, int num2)
	{
		System.out.println("*****CALCULATOR PROGRAM*****");
		System.out.println("*********************");
		switch(ch)
		{
		case 1 :
			System.out.println(">>>>>>>>>>Addition<<<<<<<<<<");
			int add = num1+num2;
			System.out.println(num1+"+"+num2+" = "+add);
			break;
		
		case 2 :
			System.out.println(">>>>>>>>>>Substraction<<<<<<<<<<");
			int sub = num1-num2;
			System.out.println(num1+"-"+num2+" = "+sub);
			break;
		
		case 3 :
			System.out.println(">>>>>>>>>>Multiplication<<<<<<<<<<");
			int mul = num1*num2;
			System.out.println(num1+"*"+num2+" = "+mul);
			break;
			
		case 4 :
			System.out.println(">>>>>>>>>>Division<<<<<<<<<<");
			float div = num1/num2;
			System.out.println(num1+"/"+num2+" = "+div);
			break;
		
		case 5 :
			System.out.println(">>>>>>>>>>Percentile<<<<<<<<<<");
			float res = num1%num2;
			System.out.println(num1+"%"+num2+" = "+res);
			break;
			
		default :
			System.out.println("Enter a valid choice, Rerun the Program");
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter two integer numbers : ");
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		System.out.println("Enter your choice from below options:");
		System.out.println("Addition = 1\nSubstraction = 2\nMultiplication = 3\nDivision = 4\nPercentage = 5");
		int choice = scn.nextInt();
		Java_Switch_Case jsc = new Java_Switch_Case();
		jsc.calculator(choice, num1, num2);
	}

}
