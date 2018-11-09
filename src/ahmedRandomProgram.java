
import java.util.Scanner;
public class ahmedRandomProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive integer.");
		int limit = input.nextInt();
		int divisors = 0;
		int big = 0;
		int answer=0;

		for (int count = 1; count<=limit; count++)
		{
		    for (int num =1; num<=limit; num++)
		    {
		    if (count%num==0)
		    {
		        divisors++;
		    }
		    if (divisors >= big)
		    {
		        big = divisors;
		        answer = count;
		    }
		}
		    divisors = 0;

		}
		System.out.println("Number with greatest number of divisors: "+answer);
	}

}
