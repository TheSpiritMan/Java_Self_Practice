import java.util.Scanner;
public class AreaOfCircle{

	static void calculateArea(int radius){
		System.out.println(3.14*radius*radius);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int radius = input.nextInt();

		calculateArea(radius);
	}
}

//Input 5
//Output 78.5