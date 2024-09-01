package Java_programs_practice_Manali;

public class Variables_Java {
	
	//Variables
	// Local 
	// Global >>> Static and non static

	//local >> you need to initialized it
	static int manali_salary = 5000;
	int ajay_salary = 5454;
	
	public  void manali_details() {
		System.out.println("The details strts from here");
		System.out.println("Ajay salary  = "+ajay_salary);
		Variables_Java ref = new Variables_Java();
		ref.manali_salary = 4000;
		// int vijay = 5454;
		ref.ajay_salary=77787;
		ajay_salary = 454545;
		System.out.println("ajay updated salary = "+ajay_salary);
		
		
	}

	public static void main(String[] args) {
		System.out.println("Here you can write program");
		int salr=250000;
		System.out.println(salr);
		System.out.println("this is ajays sal  = "+salr);
		//System.out.println(salr);
		//static int value = 2544;
		System.out.println("Manalis salary  = "+manali_salary);
		
		//Create the class object
		
		Variables_Java ref = new Variables_Java();
		//ajay salary
		ref.manali_details();
		System.out.println("Manalis salary updated = "+ref.manali_salary);
		System.out.println("Ajays original salary = "+ref.ajay_salary);
		Variables_Java ger = new Variables_Java();
		System.out.println(ger.ajay_salary);
		System.out.println(ger.manali_salary);
		

	}

}
