import java.util.Scanner;
public class AreaOfTriangle{

	void getArea(Double side1, Double side2, Double side3){
		Double semi_peri = (side1+side2+side3)/2;
		Double area = Math.sqrt(semi_peri * (semi_peri - side1) * (semi_peri - side2) * (semi_peri - side3));
		System.out.println("The area of the triangle is "+area);
	}

	public static void main(String[] args) {
		AreaOfTriangle aT = new AreaOfTriangle();
		Scanner input = new Scanner(System.in);
		System.out.print("Input Side-1: ");	
		Double side1 = input.nextDouble();
		
		System.out.print("Input Side-2: ");
		Double side2 = input.nextDouble();

		System.out.print("Input Side-3: ");
		Double side3 = input.nextDouble();

		aT.getArea(side1, side2, side3);
	}
}



//Input
/*Input Side-1: 10
Input Side-2: 15
Input Side-3: 20
*/

//Output
//The area of the triangle is 72.61843774138907
