import java.util.Scanner;
public class Main{

	void sum(int num1, int num2, int num3){
		System.out.println(num1 + num2 + num3);
	}
	public static void main(String[] args) {
		Main m = new Main();

		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt();
		m.sum(n1,n2,n3);
	}
}


//Input
//12 45 98

//Output
//155