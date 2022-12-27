import java.util.Scanner;

public class AllPossibilities{

	static int isAllPossibilities(int[] a){
		boolean flag = false;

		if(a.length == 0)
			return 0;
		int[] arr = sortedArray(a);

		for(int i = 0; i < arr.length; i++){
			if(i == arr[i] && i <= arr.length - 1){
				flag = true;
				continue;
			}

			flag = false;
			break;
		}

		return flag ? 1 : 0;
	}

	static int[] sortedArray(int[] a){
		int temp = 0;
		for(int i =0; i < a.length; i++){
			for(int j = i + 1; j < a.length; j++){
				if(a[i] > a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter length of array: ");
	int length = input.nextInt();
	int[] arr = new int[length];

	System.out.print("Enter integer of array: ");
	for(int i = 0; i<= length - 1; i++){
		int temp = input.nextInt();
		arr[i] = temp;
	}
	System.out.println(isAllPossibilities(arr));
	}
}





//Input

/*
//4
//0 1 2 3


//5
//1 2 3 4 0

//3
//2 3 4

*/
//Output
//1
//1
//0