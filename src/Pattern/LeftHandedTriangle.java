package Pattern;

import java.util.Scanner;

class Triangle{
	int row  ;
	int column;
	
	Triangle(int r, int col) {
        this.row = r;
        this.column = col;
    }
	void Display() {
		System.out.println("Your row and columns values are : " + row +" and " + column);
			}
	void operation() {
		for (int i =row; i>=0 ;i--) {
			for(int j =i; j<=column; j++) 
				System.out.print("*");
			System.out.println();
			}
	}
}

public class LeftHandedTriangle {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter you values for row and column :");
		int r = sc.nextInt();
		int col = sc.nextInt();
		
		Triangle tri = new Triangle(r,col);
		tri.Display();
		tri.operation();
		
		sc.close();
	}

}
