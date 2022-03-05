import java.util.Scanner;

public class CheckParam{

	static boolean isSameNum(int num1 , int num2){
		if(num1 == num2)
			return true;
		else
			return false;		
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();

		System.out.println(isSameNum(num1,num2));
	}
}


//Input
// 5 5
// 5 10



//Output
// true
// false