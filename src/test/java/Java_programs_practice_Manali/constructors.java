package Java_programs_practice_Manali;

public class constructors {
	
	int id = 202;
	int age;
	int sal;
	

	/*public constructors() {
		//this(20);
		int id = 105;
		int updatedid = this.id;
		System.out.println("Manali");
		System.out.println("Age =24");
		System.out.println("4454");
		System.out.println(id);
		System.out.println(updatedid);
	}*/
/*	private constructors(int num1) {
		this(154.15f);
		System.out.println("ajay");
		System.out.println("Age =24");
		System.out.println("4454");
	}
	
	public constructors(float num1) {
		
		System.out.println("sanajay");
		System.out.println("Age =24");
		System.out.println("4454");
	}
	*/
	
	public constructors() {
		 age=25;
		 sal=25000;
		 age=age+5;
		
	}
	
	public static void main(String[] args) {
		constructors ref = new constructors();
		//constructors gef = new constructors(90);
        System.out.println(ref.age); 
	}

}
