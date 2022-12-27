import java.util.Scanner;
public class Palindrome{

	 boolean checkPalindrome(int num){
		int originalNum = num, reversedNum = 0, remainder;

		while(num !=0 ){
			remainder = num % 10;
			reversedNum = reversedNum * 10 + remainder;
			num /= 10;
		}
		
		if(originalNum == reversedNum)
			return true;
		else 
			return false;
	}

	public static void main(String[] args) {
	Palindrome p = new Palindrome();

		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

		System.out.println(p.checkPalindrome(num));
	}
}



//Input 6464
//Output false