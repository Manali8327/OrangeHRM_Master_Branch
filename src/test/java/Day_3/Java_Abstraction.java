package Day_3;

import java.util.Scanner;

abstract class color{
	public abstract void color_name(String color_name);
}

class colorName extends color{
	public void color_name(String color_name) {
		System.out.println("Color Entered is = "+color_name);
	}
}

public class Java_Abstraction{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Color : ");
		String colour = scn.nextLine();
		colorName cna = new colorName();
		System.out.println("**********************");
		cna.color_name(colour);
	}
}