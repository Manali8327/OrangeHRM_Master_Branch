package Day_1;

public class Java_Variables {
  
	//global variables
	static int age = 26;
	float salary = 50000.40f;
	double year;
	//new non static method
	public void SalaryUpdate() {
		salary = salary+5000; 
		System.out.println("Non Static Method to Update Salary");
		//Accessing Non static Method directly
		System.out.println("Updated Salary = "+salary);
		System.out.println("Age Value in Non Static Method= "+age); 
		year = 2024;
		System.out.println("Year = "+year);
	}
	
	public static void AgeUpdate() {
		age=age+2;
		String name = "Manali";
		String surname = "Gaikwad";
		System.out.println("Static Method to Update Age");
		System.out.println("Name ="+name+" "+surname);
		//Accessing static Method directly
		System.out.println("Updated Age Value in Static Method= "+age);
		Java_Variables methodobject = new Java_Variables();
		//Accessing non static method using class object
		System.out.println("Salary = "+methodobject.salary);
//		methodobject.year = 2020;
		System.out.println("Year = "+methodobject.year);
	}

	public static void main(String[] args) {
		//local variable
		int id = 01;
		System.out.println("Main Method");
		System.out.print(id+"\n");
		//New line print
		System.out.println("    ID = "+id);
		//Accessing static variable directly
		System.out.println("Age = "+age); 
		//Calling Static Method directly
		AgeUpdate();
		
		//Class Object Creation
		Java_Variables var = new Java_Variables();
		//Accessing Variables,Method using Class Object
		System.out.println("Non Static Variable Salary = "+var.salary);
		var.SalaryUpdate();
		System.out.println("Year = "+var.year);
		System.out.println("New Class Object");
		Java_Variables var1 = new Java_Variables();
		System.out.println("Age = "+var1.age);
		//Non Static Variable = No change
		System.out.println("Salary = "+var1.salary);
		var1.SalaryUpdate();
		var1.AgeUpdate();
	}
	
	
}
