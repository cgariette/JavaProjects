import java.util.Scanner;

public class IfElseifDemo{
	public static void main (String [] args){
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the student's name: ");

		String name = scan.nextLine();

		System.out.println("Please enter " + name + "'s test score: ");

		int testscore = scan.nextInt();
		char grade;

		if(testscore >= 90)
		{
			grade = 'A';
		}
		else if (testscore >=80){
			grade = 'B';
		}
		else if (testscore >= 70)
		{
			grade = 'C';
		}
		else if (testscore >=60)
		{
			grade = 'D';
		}
		else if (testscore >=50)
		{
			grade = 'E';
		}
		else {
			grade = 'F';
		}

		System.out.println(name + "'s grade is: " + grade);

	}
}
