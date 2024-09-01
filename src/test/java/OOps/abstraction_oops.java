package OOps;

abstract class example1{
	// abstract class cant able to create the object 
	// abstract keyword used to for decalration
	// abstract class is having abstract and non abstract methods
	// constructors static methods 
	int salary ;
	int age;
	
	public example1(){
		salary = 25000;
		age=25;
		System.out.println("Iam a public constructor");
		System.out.println("the salary is  = "+salary);
		System.out.println("the age is  = "+age);
	}
	
	public abstract void Animal();
	
	public void Dog() {
		System.out.println("Dog is barking");
	}
}

class childclasses extends abstraction_oops{
	void Animal(){
		System.out.println("Animal can walk");
	}
}





public class abstraction_oops {

	public static void main(String[] args) {
		childclasses ref= new childclasses();
		ref.Animal();

	}

}
