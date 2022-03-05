import java.util.Scanner;
public class CountVowel{

	void isVowel(String word){
		int vowel =0;
		for(int i = 0 ; i<word.length();i++){
			if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u')
				vowel++;
		}

		System.out.println(vowel);
	}
	public static void main(String[] args) {
		CountVowel cV = new CountVowel();
		Scanner input = new Scanner(System.in);

		String word = input.nextLine();

		cV.isVowel(word);
	}
}


//Input bckdkdkdd  hello

//Output 0 2
