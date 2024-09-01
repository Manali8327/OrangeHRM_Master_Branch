package Java_programs_practice_Manali;

import java.util.Scanner;

public class switchCase {
	public void monthNames() {
		System.out.println("Months Names");
		System.out.println("*********************************");
		System.out.println("January   >> 1");
		System.out.println("February  >> 2 ");
		System.out.println("March     >> 3 ");
		System.out.println("April     >> 4 ");
		System.out.println("May       >> 5");
		System.out.println("June      >> 6 ");
		System.out.println("July      >> 7 ");
		System.out.println("August    >> 8 ");
		System.out.println("September >> 9 ");
		System.out.println("October   >> 10 ");
		System.out.println("November  >> 11 ");
		System.out.println("December  >> 12 ");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		//January, February, March, April, May, June, July, August, 
		//September, October, November, and December.
	}
	
	public void monthsDays(int monthNumber) {
		System.out.println("********Days in Months 2024**********");
		
		switch(monthNumber) {
		case 1:
			System.out.println(" Days in January 30");
			break;
		case 2:
			System.out.println("Days in February 28");
			break;
		case 3:
			System.out.println("Days in March 31");
			break;
		case 4:
			System.out.println("Days in April 30");
			break;
			
		case 5:
			System.out.println(" Days in May 31");
			break;
		case 6:
			System.out.println(" Days in June 30");
			break;
		case 7:
			System.out.println(" Days in July 31");
			break;
		case 8:
			System.out.println(" Days in August 31");
			break;
		case 9:
			System.out.println(" Days in September 30");
			break;
		case 10:
			System.out.println(" Days in October 31");
			break;
		case 11:
			System.out.println(" Days in November 30");
			break;
		case 12:
			System.out.println(" Days in December 31");
			break;
		default:
			System.out.println("please enter the valid month number from 1 to 12");
		
		}
		
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
     switchCase ref =  new switchCase();
     ref.monthNames();
     System.out.println("Enter the number of month which shown above");
     int num = scn.nextInt();
     ref.monthsDays(num);
     
     

	}

}
