public class Pyramid{
	public static void main (String args []){
		int rows =9;

		for (int i=0; i<rows; i++){
			for (int j=0; j <rows-1; j++) {
				System.out.println(" ");
			}
	for (int k=0; k<=i; k++) {
		System.out.println("* ");
	}
	System.out.println();
		}
	}
}
