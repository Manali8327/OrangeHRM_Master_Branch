//Program to Left Rotate the Elements of Array
package Java_Programs;

import java.util.Scanner;

public class Left_Rotate_Array_Elements {
	
	//Method to Left Rotate by One
	public static void left_Rotate(int size) {
		int arr1[] = Copy_Array_Elements.get_Array(size);
		int arr2[] = new int[size];
		int i;
		//Rotate Array Elements by One
		int firstElement = arr1[0];
		for(i=0;i<size-1;i++) {
			arr2[i]=arr1[i+1];
		}
		arr2[i] = firstElement;
		System.out.println("\nArray Elements after Left Rotate by One");
		for(int j=0;j<size;j++) {
			System.out.println("Array Element at Position ["+j+"] = "+arr2[j]);
		}
	}
	
	// Method to Accept Array Elements from User
	/*public static int[] get_Array(int size) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Array Elements : ");
		// array initialization
		int arr[] = new int[size];
		// Accept Array Elements
		for (int i = 0; i < size; i++) {
			arr[i] = scn.nextInt();
		}
		// Print array 1 Elements
		System.out.println("\nOriginal Array Elements : ");
		for (int j = 0; j < size; j++) {
			System.out.println("Array Element at Position [" + j + "] = " + arr[j]);
		}
		return arr;
	}*/

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Size of Array : ");
		int size = scn.nextInt();
		Left_Rotate_Array_Elements lrae = new Left_Rotate_Array_Elements();
		lrae.left_Rotate(size);
		
	}

}
