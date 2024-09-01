package Day_2;

import java.util.Scanner;

public class Java_If_Else_Condition {

	public String verify_Details(int Id, String name) {
		String value="Null";
		if(Id==111 && name.equals("Manali"))
		{
			System.out.println("ID = "+Id+"\nName = "+name);
			value = "True";
		}
		else
		{
			System.out.println("ID = "+Id+"\nName = "+name);
			value = "False";
		}
		return value;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Id and name :");
		int empID = scn.nextInt();
		System.out.println();
		String username = scn.nextLine();
		Java_If_Else_Condition iec = new Java_If_Else_Condition();
		String result = iec.verify_Details(empID, username);
		//System.out.println(result);
		//String positive = "True";
		//String negative = "False";
		if(result.equals("True"))
		{
			System.out.println("Details entered verified successfully");
		}
		else if(result.equals("False"))
		{
			System.out.println("Details entered are incorrect");
		}
		else
		{
			System.out.println("If block did not run, Rerun the code");
		}
	}

}
