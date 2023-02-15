import java.util.Scanner;

public class Pyramid{
	public static void main (String args []){
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the number of rows: ");
		
		int rows= scan.nextInt();

		for (int i=0; i<rows; i++){
			for (int j=0; j<rows-i; j++) {
				System.out.print(" ");
			}
	for (int k=0; k<=i; k++) {
		System.out.print("* ");
	}
	System.out.println();
		}
	}
}
