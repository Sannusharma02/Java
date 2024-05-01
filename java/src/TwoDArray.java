public class TwoDArray {

	public static void main(String[] args) {
		int i,j;
		
		int ar1[][]= {{101,202,303},{404,505,606},{707,808,909}};
		
		for (i = 0; i < ar1.length; i++) {
			System.out.print("{");
			for (j = 0; j < ar1.length; j++) {
				System.out.print(ar1[i][j]+" ");
			}
			System.out.print("} ");
			System.out.print("ar1 ["+i+"]["+j+"]");
			System.out.println();
		}
	}
}