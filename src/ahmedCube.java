import java.util.Scanner;

public class ahmedCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Gimme a number");
		int number = input.nextInt();

		while (number != -1) {
			System.out.println(number * number * number);
			System.out.println("Gimme a number (-1 to quit)");
			number = input.nextInt();

		}
	}

}
