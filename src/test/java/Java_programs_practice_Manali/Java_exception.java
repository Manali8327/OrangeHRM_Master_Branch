package Java_programs_practice_Manali;

import java.io.IOException;

public class Java_exception {

	public static void main(String[] args) throws IOException {
		int a,b,c;
		a=20;
		b=0;
	
		System.out.println("its terminated");
		try {
			c=a/b;
			System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println("Exception handled "+e);
		
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("In array"+e);
		}catch(Throwable e) {
			System.out.println("Executed");
		}finally {
			System.out.println("iam executed always");
		}
      System.out.println("The program executed succesfully");
	}

}
