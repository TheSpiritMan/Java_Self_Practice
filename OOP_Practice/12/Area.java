import java.util.Scanner;
public class Area{
	int len, bdth;
	Area(int len, int bdth){
		this.len = len;
		this.bdth = bdth;
	}
	void returnArea(){
		System.out.println(len*bdth);
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int breadth = sc.nextInt();
		Area a = new Area(length,breadth);
		a.returnArea();
	}
}


//Input
//5 3

//Output
//15