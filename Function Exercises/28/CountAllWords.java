//Same as Q. NO. 16

import java.util.Scanner;
public class CountAllWords{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input the string: ");
		String words = input.nextLine();
		int wordLength = 0;
		for(String word : words.split("\\s+")){
			wordLength++;
		}

		System.out.println("Number of words in the string: "+wordLength);		
	}
}

//Input
//The quick brown fox jumps over the lazy dog


//Output
//9