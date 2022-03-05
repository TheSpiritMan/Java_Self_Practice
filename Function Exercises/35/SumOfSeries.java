import java.util.Scanner;
public class SumOfSeries{

	 static long getFactorial(long num){
		if(num <=1)
			return 1;
		else
			return num * getFactorial(num - 1);
	}
	long seriesSum(long number){
		long sum = 0;
		
		for(long i = 1; i <= number; i++){
			sum += getFactorial(number);
		}
		return sum;
	}

	public static void main(String[] args) {
		SumOfSeries sos = new SumOfSeries();
		Scanner input = new Scanner(System.in);
		long number = input.nextLong();
		System.out.println("Sum Of Series: " +sos.seriesSum(number));
	}
}


//Input 6
//Output Sum Of Series: 4320