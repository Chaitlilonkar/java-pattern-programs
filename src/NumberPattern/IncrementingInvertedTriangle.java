package NumberPattern;

public class IncrementingInvertedTriangle {
	public static void main(String []arg) {
		int n =4;
		int count =0;
		for(int i =n;i>=1;i--) {
			for(int j =1; j<=i;j++) {
				count+=i;
				System.out.print(i);
			}
			System.out.println();
		}
	}
}


// initialised = 3

/*import java.util.Scanner;

public class IncrementingInvertedTriangle{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no . of rows and column : ");
		int row = sc.nextInt();
		int col =sc.nextInt();
		
		int count =col+2;
		
		for(int i=row;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(count);
				
			}
			count--;
			System.out.println();
		}
	}
}
*/


