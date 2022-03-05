import java.util.Scanner;
public class GCD{
	static int gcd(int num1, int num2){
		if(num2 != 0)
			return gcd(num2,num1%num2);
		else
			return num1;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();

		System.out.printf("GCD of %d and %d is %d",num1,num2,gcd(num1,num2));
	}
}


//Input 366 60
//Output
//GCD of 366 and 60 is 6
