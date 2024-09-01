package Day_3;

class Flower{  
	String name = "FLOWERS";
	void message()
	{
		System.out.println("Parent class method accessed using this from child class");
	}
	void color(){
		System.out.println("Red");
	}  
}

class Rose extends Flower{
	void fragrance(){
		System.out.println(this.name);
		System.out.println("Warm");
	}
}

class Sunflower extends Flower{  
	Sunflower(){
		this.message();
		System.out.println("*************");
		System.out.println("sunflower constructor");
	}
	void color(String ar){
		System.out.println(ar);
		System.out.println("Yellow");
	}  
}

class Java_Inheritance{  
	public static void main(String args[]){  
		Rose r=new Rose();
		Sunflower s = new Sunflower();
		r.fragrance();  
		System.out.println("*************");
		r.color();
		System.out.println("*************");
		s.color();
		System.out.println("*************");
		s.color("Overidden Method");
	}
}