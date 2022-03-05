import java.util.Scanner;
public class PrimeNum{

	static boolean checkPrime(int testNumber){
		boolean flag = true;
		if(testNumber == 0 || testNumber == 1){
			flag = false;
		}else{
			for(int i=2; i<=testNumber/2; i++){
				if(testNumber%i == 0){
					flag = false;
					break;
				}
			}
		}
		
		return flag;
	}


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

		System.out.println(checkPrime(num));
	}
}

//Input 
// 15 25 30 11 17

//Output
// false false false true true true