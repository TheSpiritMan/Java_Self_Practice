import java.util.Scanner;
public class MulTable{
	void printMuliplication(int inputNumber){
		for(int i=1;i<=10;i++){
			System.out.printf("%d * %d = %d\n",inputNumber,i,inputNumber*i);	
		}
	}

	public static void main(String[] args) {
		MulTable mT = new MulTable();
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		mT.printMuliplication(num);
	}
}


//Input 7

//Output
/*
7 * 1 = 7
7 * 2 = 14
7 * 3 = 21
7 * 4 = 28
7 * 5 = 35
7 * 6 = 42
7 * 7 = 49
7 * 8 = 56
7 * 9 = 63
7 * 10 = 70
*/