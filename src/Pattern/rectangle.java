package Pattern;

import java.util.Scanner;

public class rectangle {
	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of row : ");
		int r = sc.nextInt();
		System.out.print("Enter the number of column : ");
		int col = sc.nextInt();
		
		for(int i = 1;i<=r; i++) {
			
			
			for(int j = 1; j<=col; j++) 
				System.out.print(" * ");
			
			System.out.println();
		}
		
	}
	
}


