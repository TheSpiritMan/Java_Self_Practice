import java.util.Scanner;
public class CountWord{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String words = input.nextLine();
		int wordLength = 0;
		for(String word : words.split("\\s+")){
			wordLength++;
		}

		System.out.println(wordLength);		
	}
}

//Input
//I want to be a software engineer


//Output
//7