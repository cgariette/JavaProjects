import java.util.Scanner;

public class Vehicles{
	public static void main(String args []){
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your vehicle's weight");
		int weight=scan.nextInt();

		if(weight>=7000){
			System.out.println("Your vehicle is a trailer");
	}
	else if (weight >= 5000){
		System.out.println("Your vehicle is a bus");
	}
	else if(weight >= 3000);{
		System.out.println("Your vehicle is a minibus");
	}
	else if(weight >= 1500){
		System.out.println("Your vehicle is a saloon");
	}
	}
}
