import java.util.Scanner;
public class IsVowel{

	boolean isVowel(String word){
		boolean flag = false;
		for(int i = 0 ; i<word.length();i++){
			if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u')
				flag = true;
		}

		return flag;
	}
	public static void main(String[] args) {
		IsVowel iV = new IsVowel();
		Scanner input = new Scanner(System.in);

		String word = input.nextLine();

		System.out.println(iV.isVowel(word));
	}
}


//Input bckdkdkdd  hello

//Output false true
