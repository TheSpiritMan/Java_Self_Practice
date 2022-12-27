import java.util.Scanner;
public class DisplayOddNum{

	void display(int start, int end){
		for(int i=start;i<=end;i++){
			if(i%2==1)
				System.out.printf("%d ",i);
		}
	}

	public static void main(String[] args) {

		DisplayOddNum drn = new DisplayOddNum();
		Scanner input = new Scanner(System.in);
		int start = input.nextInt();
		int end = input.nextInt();

		drn.display(start,end);
	}
}

//Input
// 55 100

//Output
// 55 57 59 61 63 65 67 69 71 73 75 77 79 81 83 85 87 89 91 93 95 97 99 