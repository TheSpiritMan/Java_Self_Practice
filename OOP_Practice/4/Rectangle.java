public class Rectangle{
	void area(int length,int breadth){
		System.out.println("Area: "+ length*breadth);
	}

	void perimeter(int length,int breadth){
		System.out.println("Perimeter: "+ Math.pow((length+breadth),2));
	}

	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		rec.area(2,5);
		rec.perimeter(2,5);
	}
}

//Output
/*
Area: 10
Perimeter: 49.0
*/