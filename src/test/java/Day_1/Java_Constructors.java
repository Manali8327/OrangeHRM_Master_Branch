package Day_1;

public class Java_Constructors {
	
	int sal;
	
	//Default Constructor
	public Java_Constructors(){
		this("Details");
		System.out.println("Default Constructor");
		int salary = this.sal;
		System.out.println("Salary = "+salary);
		salary = 45000;
		System.out.println("Salary = "+salary);
	}
	
	//Parameterized Contructor
	public Java_Constructors(String value) {
		System.out.println("****"+value+"****");
		System.out.println("Name = Manali");
		System.out.println("Age = 26");
		System.out.println("Gender = Female");
	}
	
	
	public static void main(String[] args) {
		Java_Constructors jvc = new Java_Constructors();

	}

}
