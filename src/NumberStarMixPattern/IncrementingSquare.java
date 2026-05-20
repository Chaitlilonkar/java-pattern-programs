package NumberStarMixPattern;

public class IncrementingSquare {
	public static void main(String []args) {
		int n=4;
		int num =0;
		
		for(int i=1;i<=n;i++) {
			for(int j =1;j<=n;j++) {
				num++;
				System.out.print(num);
				if(j!=n) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
