import java.util.Scanner;
public class Vote{

	void findout(int age){
		if(age>=18)
			System.out.println("Eligible To Vote");
		else
			System.out.println("Not Eligible To Vote");
	}

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int age = input.nextInt();

			Vote v = new Vote();
			v.findout(age);
	}

}

//Input
//12
//55

//Output
//Not Eligible To Vote
//Eligible To Vote