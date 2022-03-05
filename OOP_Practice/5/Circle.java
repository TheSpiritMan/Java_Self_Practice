public class Circle{
	void area(int radius){
		System.out.println("Area: "+ 3.14 * Math.pow(radius,2));
	}

	void perimeter(int radius){
		System.out.println("Perimeter: "+ 2 * 3.14 * radius );
	}

	public static void main(String[] args) {
		Circle rec = new Circle();
		rec.area(5);
		rec.perimeter(5);
	}
}

//Output
/*
Area: 78.5
Perimeter: 31.400000000000002
*/