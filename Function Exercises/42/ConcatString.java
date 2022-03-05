import java.util.Scanner;
import java.util.StringJoiner;

public class ConcatString{
	static String concat(String[] arr){
		StringJoiner joiner = new StringJoiner("");
     	 for(int i = 0; i < arr.length; i++) {
         	joiner.add(arr[i]);
      	}
      	String str = joiner.toString();
      	return str;
	}


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of Words: ");
		int length = input.nextInt();
		String[] arr = new String[length];

		System.out.print("Enter Words: ");
		for(int i = 0; i< length; i++){
			arr[i] = input.next();
		}
		System.out.println(concat(arr));
	}
}




//Input 2   Hello TheSpiritMan

//Output    HelloTheSpiritMan