import java.lang.Math;
import java.util.Scanner;

public class CheckArmstrongAndPerfectNum{

	static boolean checkArmstrong(int num){
		int temp, digits = 0, last = 0, sum = 0;
		
		temp = num;
		while(temp > 0){
			temp = temp/10;
			digits++;
		}
		
		temp = num;
		while(temp > 0){
			last = temp % 10;
			sum += (Math.pow(last,digits));
			temp = temp/10;
		}

		if(num == sum)
			return true;
		else
			return false;
	}


	static boolean checkPerferct(int num){
		int sum = 1;

		for(int i = 2; i * i <= num; i++){
			if(num % i == 0){
				if(i * i != num)
					sum = sum + i + num/i;
				else
					sum = sum + i;
			}
		}


		if(sum == num && num != 1)
			return true;

		return false;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input any number: ");
		int num = input.nextInt();

		if(checkArmstrong(num))
			System.out.println("The "+num+" is an Armstrong number.");
		else
			System.out.println("The "+num+" is not an Armstrong number.");

		if(checkPerferct(num))
			System.out.println("The "+num+" is a Perfect number.");
		else
			System.out.println("The "+num+" is not a Perfect number.");
	}
}



//Input
//Input any number: 371


//Output
/*
The 371 is an Armstrong number.
The 371 is not a Perfect number.
*/