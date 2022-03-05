import java.util.Scanner;

public class PrintSum{
	void sum(int num1, int num2){
		System.out.println(num1+num2);

	}
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int num1 = input.nextInt();
			int num2 = input.nextInt();

			PrintSum pS = new PrintSum();
			pS.sum(num1,num2);
	}
}


//Input 22 33
//Output 55