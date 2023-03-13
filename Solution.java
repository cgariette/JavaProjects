import java.util.*;
import java.io.*;

class Solution {

	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		int allow;
		double hra, da, pf;

		System.out.println("Please enter the salary and grade");

		int salary = input.nextInt();
		char ch = input.next().charAt(0);

		hra = (salary*0.2);
		da = (salary* 0.5);
		pf = (salary* 0.11);

		if (ch == 'A')
		{
			allow = 1700;
		}
		else if (ch == 'B')
		{
			allow = 1500;
		}
		else
		{
			allow = 1300;
		}
		double totalSalary = salary + hra + da + allow - pf;

		int tS = (int) Math.round(totalSalary);

		System.out.println("Basic Salary = " +salary);
		System.out.println("hra (20%) = " +hra);
		System.out.println("da (50%) = " +da);
		System.out.println("allow = " +allow);
		System.out.println("pf (11%) = " +pf);
		System.out.println("Total Salary = " +tS);
	}
}
