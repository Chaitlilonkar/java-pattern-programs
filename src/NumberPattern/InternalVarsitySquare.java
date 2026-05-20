package NumberPattern;

public class InternalVarsitySquare {
	public static void main(String args[]) {
		int row=4;
		int col =3;
		
		 for (int i = 0; i < row; i++) {

	            for (int j = 0; j < col; j++) {

	                if (j == 0 || j == 2) {
	                    System.out.print("3 ");
	                } else {

	                    if (i == 1) {
	                        System.out.print("1 ");
	                    } else if (i == 2) {
	                        System.out.print("2 ");
	                    } else {
	                        System.out.print("3 ");
	                    }
	                }
	            }

	            System.out.println();
	        }
	}

}
