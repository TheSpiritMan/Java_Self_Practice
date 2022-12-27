import java.util.Scanner;
public class PrintGrade{
	String checkGrade(int num1){
		String result=" ";
		if(num1<=40)
			result = "Fail";
		else if(41 <= num1 && num1 <= 50)
			result = "DD";
		else if(51 <= num1 && num1 <= 60)
			result = "CD";
		else if(61 <= num1 && num1 <= 70)
			result = "BC";
		else if(71 <= num1 && num1 <= 80)
			result = "BB";
		else if(81 <= num1 && num1 <= 90)
			result = "AB";
		else if(91 <= num1 && num1 <= 100)
			result = "AA";
		else
			result = "Error";
		return result;	
	}


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			int num1 = input.nextInt();

		PrintGrade pG = new PrintGrade();
		System.out.println(pG.checkGrade(num1));	
	}
}



//Input 58
//Output CD