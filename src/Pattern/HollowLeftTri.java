package Pattern;

public class HollowLeftTri {
	public static void main(String[] arrgs) {
		int n =6;
		
		for(int i =1;i<=n;i++) {
			for(int j =1;j<=i;j++){
				if(j==1 || j==i || i==n) 
				System.out.print("*");			
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
