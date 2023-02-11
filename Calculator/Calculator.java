import java.util.*;

public class Calculator{
	public static void main(String args []){
	 int num1, num2, result;
	 char operator;

	 Scanner scan= new Scanner(System.in);

	 System.out.println("Please enter your first number:");
	 num1= scan.nextInt();
	 System.out.println("Please enter your second number");
	 num2 = scan.nextInt();
	 System.out.println("Please enter your arithmetic operator(+,-,*,/,%)");
 	operator= scan.next().charAt(0);

	 if(operator == '+'){
		 result=num1 + num2;
		 System.out.println("The sum of the two numbers is: " + result);
	 }
	 if (operator == '-'){
		 result=num1-num2;
		 System.out.println("The difference of the two numbers is: " + result);
	 }
	 if (operator == '*'){
		 result=num1*num2;
		 System.out.println("The multiplication of the two numbers results to: " + result);	 }
	 if (operator == '/') {
		 result= num1 / num2;
		 System.out.println("Dividing the two numbers results to: " + result);
	 }

	if (operator == '%') {
		result = num1 % num2;
		System.out.println("The modulus of the two numbers is: " + result);
	}
	}
}
