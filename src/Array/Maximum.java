package Array;

import java.util.Scanner;

public class Maximum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int[] arr = new int[4];
		int temp;
		int max;
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			temp = arr[i];
			arr[i]=temp;
			System.out.println(temp);
		}
		}

}
