import java.util.Scanner;
public class HighLow{

	void averageNumber(int num1, int num2, int num3){
		int high = num1;
		int low = num1;

		if(num2 > high)
			high = num2;
		if(num2 < low)
			low = num2;

		if(num3 > high)
			high = num3;
		if(num3 < low)
			low = num3;

		System.out.println("High: "+high+"\n"+"Low: "+low);
	}

	public static void main(String[] args) {
		HighLow hl = new HighLow();
		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt();
		hl.averageNumber(n1,n2,n3);
	}
}



//Input
// 98 45 55

//Output
//High: 98
//Low: 45
