package Array;

import java.util.Scanner;

public class SumOfElements {
	public static void main(String []args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 5 numbers :");
		int arr [] = new int[5];
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();	
		}
		for(int i=0;i<arr.length;i++) {
			 sum +=arr[i];	
		}
		 System.out.println(sum);
	}

}
