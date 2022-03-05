import java.util.Scanner;

public class Circle{
	void area(int rad){
		System.out.println(3.14*rad*rad);
	}
	void circumference(int rad){
		System.out.println(2*3.14*rad);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int radius = input.nextInt();

		Circle c = new Circle();
		c.area(radius);
		c.circumference(radius);
	}
}

//Input
//3

//Output
//28.259999999999998
//18.84