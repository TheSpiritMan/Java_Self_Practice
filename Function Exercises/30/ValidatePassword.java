import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class ValidatePassword{
	static boolean isValidPass(String pass,String regex){
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(pass);
		return matcher.matches();	
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		System.out.println("Input a password (You are agreeing to the above Terms and Conditions.):");
		String passwd = input.next();
		String regex = "((?=.*[a-zA-Z0-9]).{10,20})";

		boolean validPass = isValidPass(passwd,regex);
		if(validPass){
			System.out.println("Passord is valid: "+passwd);
		}else
			System.out.println("Passord is not valid: "+passwd);
	}
}


//Input
//hello123345
//123Apkabnfvjkonba
//hello



//Output
//Passord is valid: hello123345
//Passord is valid: 123Apkabnfvjkonba
//Passord is not valid: hello