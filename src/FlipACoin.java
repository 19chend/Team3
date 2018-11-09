
import java.util.Random;
public class FlipACoin {
//works but like 1 million is too big
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random generator = new Random();
int min = 0;
int max = 1;
double heads = 0;
double big = 0;
double small = 100000;

for (int counter = 1; counter <= 1000000; counter++)
{
	for (int counter2 = 1; counter2 <= 100000; counter2++)
	{
		int randomNumber = min + generator.nextInt(max - min +1);
		if (randomNumber == 0)
		{
			heads++;
			if (heads > big)
			{
				big = heads;
			}
			if (heads < small)
			{
				small = heads;
			}
	}
}

	}
System.out.println("Maximum percentage of heads: "+(big/1000)+"%");
System.out.println("Minimum percentage of heads: "+(small/1000)+"%");
	}

}
