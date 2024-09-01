package OOps;


class Animal{
    String AnimalType = "Dog";
    String DogBrid = "Lab";
	public void animalsLife() {
		System.out.println("Animal can walk");
		System.out.println("Animals can listen");
		System.out.println("Animals having emotions");
		System.out.println("Animals Having furr");
	}
	public void sound() {
		System.out.println("Dog is barking");
	}
}

class Cat extends Animal{
	int age=36;
	String catcolor=null;
	public Cat() {
		catcolor = "white";
	}
	
	@Override
	public void animalsLife() {
		int age=25;
		// TODO Auto-generated method stub
		System.out.println("Cat can do meoww");
		System.out.println("cat having different colors"+super.AnimalType);
		super.animalsLife();
	}
	
	
}

public class childclass extends Cat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childclass ref= new childclass();
		Cat gef = new Cat();
		gef.sound();
		ref.animalsLife();
		ref.sound();

	}

}
