import java.util.*;
import java.io.*;

public class MaxNumber {
	public static void main(String args []) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the length of your array: ");

		int length = input.nextInt();
		int max = Integer.MIN_VALUE;
		String[] numbers = new String[length];

		System.out.println("Please enter the elements of your array: ");
		for (int i =0; i < length; i++){
			String userInput = input.next();
				
				numbers[i] =userInput;
		}

		for (int j = 0; j < length; j ++) {
			max = Math.max(max, numbers[length]);
		}
		System.out.println(max);
	}
}
