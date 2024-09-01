package Java_programs_practice_Manali;

// interface is used for multiple inhertane and 100% abstraction
// we need to provide bodu to its all abstract methods
// veriables are by default public static final and methods are public abtsract
// two classes interite each other then use extends key word
// two interface interite each other then use extends key word
// one classe interite another interface  then use implements key word
// abstract  class and interface we cannot create object .
// we cannot use access and non access modifier
interface interface1 {
	void Animal();

	void Breed();

	void sound();
}

class Animal_Dog implements interface1 {

	@Override
	public void Animal() {
		System.out.println("Dog");
		
	}

	@Override
	public void Breed() {
		
		System.out.println("Lab");
	}

	@Override
	public void sound() {
		System.out.println("Bhoww bhowww");
		
	}
    
	
	
}

interface interface2 {
	String color = "black";
	int std = 10;
	float salary = std;//implicit
	float age = 252.25f;
	double  rahul = (int)std;
	int sanjay  = (int) age;//explicit casting
	
}

class age implements interface1{

	@Override
	public void Animal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Breed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		
	}
	
}





public class interface_multiple_inheritance implements interface1,interface2 {

	public static void main(String[] args) {
		Animal_Dog ref = new Animal_Dog();
		interface1 ger  =  new age();
		 

	}

	@Override
	public void Animal() {
		
		
	}

	@Override
	public void Breed() {
		
		
	}

	@Override
	public void sound() {
		
		
	}

}
