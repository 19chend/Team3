import java.util.Scanner;

public class ahmedAverageInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Give me a double value");
		int num = input.nextInt();
		int sum = 0;
		int times = 0;

		while (num != 9999) {
			sum = sum+num;
			times++;
			System.out.println("Give me a double value");
			 num = input.nextInt();
		}

		System.out.println("the average of the numbers is " + sum/times );
	}

}
