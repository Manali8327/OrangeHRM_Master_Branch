//Program to find frequency of Each Element in Array
package Java_Programs;

import java.util.Scanner;

public class Find_Frequency_Of_Array_Elements {

	//Method to Find Frequency of Elements
	public static void Find_Frequency(int size) {
//		int arr1[] = Copy_Array_Elements.get_Array(size);
		int arr1[] = get_Array(size);
		int arr2[] = new int[size];
		int count = 0;
		//Copy Array1 Elements into Array2
		for(int i=0;i<size;i++) {
			arr2[i]=arr1[i];
		}
		
		for(int j=0;j<size;j++) {
			for(int k=0;k<size;k++) {
				if(arr1[j]==arr2[k]) {
					count++;
				}
			}
			System.out.println("Frequency of "+arr1[j]+" = "+count);
			count=0;
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
		Find_Frequency_Of_Array_Elements fcoe = new Find_Frequency_Of_Array_Elements();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Size of Array : ");
		int size = scn.nextInt();
		fcoe.Find_Frequency(size);
	}
}
