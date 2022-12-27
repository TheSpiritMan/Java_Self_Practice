import java.util.Scanner;

public class SwapNum{
	void swap(int num1, int num2){
		int temp = num2;
		num2 = num1;
		num1 = temp;

		System.out.println("New Position: "+num1+" "+num2);
	}

	public static void main(String[] args) {
		SwapNum sN = new SwapNum();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter numbers in order: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		sN.swap(num1,num2);
	}
}



//Input
//Enter numbers in order: 32 54

//Output
// New Position: 54 32