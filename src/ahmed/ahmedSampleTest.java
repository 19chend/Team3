package ahmed;

import java.util.Scanner;
public class ahmedSampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		int even = 0;
			
		System.out.println("Give me a 3 digit number");
		num = input.nextInt();
		
		for (even=num; even<=1000; even++)
		{
			if (even%2==0)
			{
				sum = sum+even;
			}
		}
		System.out.println(sum);
		
	}

}
