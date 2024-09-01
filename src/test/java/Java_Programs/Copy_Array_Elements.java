//Program to Copy all elements of one array into another
//Code done in 2 ways
package Java_Programs;

import java.util.Scanner;

public class Copy_Array_Elements {
	
	//method to Copy Complete Array into Another
	public static void copy_Array(int size) {	
		int arr2[] = get_Array(size);
		//Print array 2 Elements
		System.out.println("\nArray 2 Elements : ");
		for(int j=0;j<arr2.length;j++) {
			System.out.println("Array Element at Position ["+j+"] = "+arr2[j]);
		}		
	}
	
	//Method to Copy Elements One by One into Another Array
	public static void copy_array_elements(int size) {
		int arr1[] = get_Array(size);
		int arr2[] = new int[size];
		//Copy Array Elements into another Array
		for(int i=0;i<size;i++) {
			arr2[i]=arr1[i];
		}
		//Print array 2 Elements
		System.out.println("\nArray 2 Elements : ");
		for(int j=0;j<arr2.length;j++) {
			System.out.println("Array Element at Position ["+j+"] = "+arr2[j]);		
		}	
	}
	
	//Method to Accept Array Elements from User
	public static int[] get_Array(int size) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Array Elements : ");
		//array initialization
		int arr[] = new int[size];
		//Accept Array Elements
		for(int i=0;i<size;i++) {
			arr[i]=scn.nextInt();		
		}
		//Print array 1 Elements
		System.out.println("\nOriginal Array Elements : ");
		for(int j=0;j<size;j++) {
			System.out.println("Array Element at Position ["+j+"] = "+arr[j]);		
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Size of Array : ");
		int size = scn.nextInt();
		Copy_Array_Elements cae = new Copy_Array_Elements();
	    cae.copy_Array(size);
	    System.out.println("***************");
	    cae.copy_array_elements(size);
	}
}