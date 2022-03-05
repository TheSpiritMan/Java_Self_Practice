import java.util.Scanner;
public class DisplayRangeNumber{

	void display(int start, int end){
		for(int i=start;i<=end;i++){
			System.out.printf("%d ",i);
		}
	}

	public static void main(String[] args) {

		DisplayRangeNumber drn = new DisplayRangeNumber();
		Scanner input = new Scanner(System.in);
		int start = input.nextInt();
		int end = input.nextInt();

		drn.display(start,end);
	}
}

//Input
//55 100
 

 //Output
/* 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100  */
