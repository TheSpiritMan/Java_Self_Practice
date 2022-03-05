import java.util.Random;

public class GenerateRandomNum{

	public static void main(String[] args) {
		Random rand = new Random();

		int num1 = rand.nextInt(500);
		int num2 = rand.nextInt(100);

		System.out.println(num1+" "+num2);
	}
}


//Output
//378 21