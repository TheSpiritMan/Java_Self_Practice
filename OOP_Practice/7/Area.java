import java.util.Scanner;
public class Area{
	int len, bdth;
	void setDim(int len, int bdth){
		this.len = len;
		this.bdth = bdth;
	}
	void getArea(){
		System.out.println(len*bdth);
	}
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
		int length = input.nextInt();
		int breadth = input.nextInt();

		Area a = new Area();
		a.setDim(length, breadth);
		a.getArea();
	}
}


//Input
//5 3

//Output
//15	
