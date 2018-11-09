package taniaPetName;

import java.util.Scanner;

public class Divisors {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive integer.");
		int num = input.nextInt();
		int divisors = 0;

		for (int count = 1; count<=num; count++)
		{
		    if (num%count==0)
		    {
		        divisors++;
		    }
		}
		System.out.println("Number of divisors: "+divisors);

		input.close();
	}

}
