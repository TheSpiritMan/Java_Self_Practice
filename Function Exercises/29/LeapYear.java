import java.util.Scanner;

public class LeapYear{

		static boolean isLeapYear(int year){
			boolean flag = false;
			if(year % 4 == 0){
				flag = true;

				if(year % 100 == 0){
					if(year % 400 == 0)
						flag = true;
					else
						flag = false;
				}
			}else
				flag = false;	
		
			return flag;
		} 

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();

		System.out.println(isLeapYear(year));
	}
}

//Input 2017
//Output false