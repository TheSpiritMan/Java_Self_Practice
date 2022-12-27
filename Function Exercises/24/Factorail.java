import java.util.Scanner;

public class Factorial{
	long getFactorial(long num){
		if(num <=1)
			return 1;
		else
			return num * getFactorial(num - 1);
	}

	public static void main(String[] args) {
		Factorial f = new Factorial();
		Scanner input = new Scanner(System.in);
		long number = input.nextLong();
		
		System.out.println(f.getFactorial(number));
	}
}


//Input
//55

//Output
//6711489344688881664