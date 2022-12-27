import java.util.Scanner;
public class EvenOdd{
	static boolean isEven(int parameter){
		if(parameter % 2 == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		EvenOdd eo = new EvenOdd();

		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		System.out.println(isEven(n1));
	}
}


//Input 
//55


//Output
//false