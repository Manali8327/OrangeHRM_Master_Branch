package Day_2;

import java.util.Scanner;

public class Java_loops {

	public void print_Tables(int num)
	{
		System.out.println("Table of "+num);
		System.out.println("*********************");
		System.out.println("Using For loop");
		for(int i=1;i<=10;i++)
		{
			int result = num*i;
			System.out.println(num+"x"+i+"="+result);
		}
		
		System.out.println("*********************");
		System.out.println("Using While loop");
		int j=1;
		while(j<=10)
		{
			int result = num*j;
			System.out.println(num+"x"+j+"="+result);
			j++;
		}
		
		System.out.println("*********************");
		System.out.println("Using Do While loop");
		int k=1;
		do
		{
			int result = num*k;
			System.out.println(num+"x"+k+"="+result);
			k++;
		}
		while(k<=10);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter number to print table : ");
		Scanner scn = new Scanner(System.in);
		int number = scn.nextInt();
		Java_loops jl = new Java_loops();
		jl.print_Tables(number);
	}

}
