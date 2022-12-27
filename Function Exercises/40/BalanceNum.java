import java.util.Scanner;

public class BalanceNum{

	static boolean balanced(int[] arr){
		boolean flag = false;
		for(int i = 0; i<arr.length; i+=2){
			if(arr[i] % 2 == 0)
				flag = true;
			else
				flag = false;
		}

		for(int i = 1; i<arr.length; i+=2){
			if(arr[i] % 2 == 1)
				flag = true;
			else
				flag = false;
		}
		return flag;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter lenghth of array: ");
		int length = input.nextInt();
		int[] arr = new int[length];
		System.out.print("Enter array: ");
		for(int i = 0; i< length; i++){
			arr[i] = input.nextInt();
		}

		System.out.println(balanced(arr));
	}
}




//Input 
//5    1 2 3 4 5
//5    0 1 2 3 4


//Output
//false
//true