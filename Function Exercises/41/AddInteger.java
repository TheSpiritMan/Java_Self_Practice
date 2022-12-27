import java.util.Scanner;

public class AddInteger{
	static int add(int[] arr){
		int sum = 0;
		for(int i = 0; i< arr.length; i++){
			sum+=arr[i];
		}
		return sum;
	}


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of input: ");
		int length = input.nextInt();
		int[] arr = new int[length];

		System.out.print("Enter numbers: ");
		for(int i = 0; i< length; i++){
			arr[i] = input.nextInt();
		}

		System.out.println(add(arr));
	}
}



//Input
// 5 123 45 22 00 114



//Output
// 304