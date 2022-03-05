import java.util.Scanner;
public class MaxMin{

	void max(int num1, int num2, int num3){
		int max = num1;
		if(num2 > max)
			max = num2;
		if(num3 > max)
			max = num3;

		System.out.println("max: "+max);
	}
	
	void min(int num1, int num2, int num3){
		int min = num1;
		if(num2 < min)
			min = num2;
		if(num3 < min)
			min = num3;

		System.out.println("min: "+min);
	}

	public static void main(String[] args) {
		MaxMin mm = new MaxMin();
		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt();
		mm.max(n1,n2,n3);
		mm.min(n1,n2,n3);
	}
}



//Input
// 98 45 55

//Output
//max: 98
//min: 45
