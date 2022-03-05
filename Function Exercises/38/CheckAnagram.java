import java.util.Scanner;
import java.util.Arrays;

public class CheckAnagram{

	static int No_Of_Chars = 256;
	static boolean areAnagram(char str1[], char str2[]){
		
		int count1[] = new int[No_Of_Chars];
		Arrays.fill(count1,0);
		int count2[] = new int[No_Of_Chars];
		Arrays.fill(count2,0);
		int i;

		for(i = 0; i < str1.length && i < str2.length; i++){
			count1[str1[i]]++;
			count2[str2[i]]++;
		}

		if(str1.length != str2.length)
			return false;

		
		for(i = 0; i < No_Of_Chars; i++){
			if(count1[i] != count2[i])
				return false;
		}
		return true;
	}


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter words to check: ");
		String string1 = input.next();
		char[] str1 = string1.toCharArray();
		String string2 = input.next();
		char[] str2 = string2.toCharArray();

		if(areAnagram(str1,str2))
			System.out.println(string1+" and "+string2+" are Anagram.");
		else
			System.out.println(string1+" and "+string2+" are not Anagram.");
	}
}





//Input
//pears spear

//Output
//pears and spear are Anagram.