package OOps;

public class Day1_by_Oops  extends ajayDetails{

	//class :- class is set of code or programs or methods
	// it is blue print which object are going to created 
	// class does not acquire the space
	// object :- object is  a instance of the class
	//ist occupie memory
	//object its real world entity which having its own identity and address
	// we can create multiple objects by giving different names
	// Major Pillars of the OOPs:-
	// Inheritance, Polymorphism,encapsulation,abstraction
	
	
	//Inheritance :- aquiring the propertis of the another class by using extend keyword
	// we can perform overriding
	//once we created the object of the child class we can acquire the properties of another 
	//parent class
	// Terms used in inheritance :- class, object, subclass/child class,parent class
	int manalisalary = 850000;
	float deduction = 25.5f;
	public static void main(String[] args) {
		Day1_by_Oops ref = new Day1_by_Oops();
		ref.details();
		
	}
}

class ajayDetails extends inheritanceday {
	
	public void details() {
		System.out.println("age = 25");
		System.out.println("salary = 250000");
		System.out.println("Ajay gaikwad");
	}
	
}

class inheritanceday{
  
	int id = 202;
	int age=25;

	
}
