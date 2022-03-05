abstract class Shape{
	abstract void RectangleArea(float len, float bdth);
	abstract void SquareArea(float side);
	abstract void CircleArea(float rad);
}

class Area extends Shape{
	void RectangleArea(float len, float bdth){
		System.out.println(len*bdth);
	}

	void SquareArea(float side){
		System.out.println(side*side);
	}

	void CircleArea(float rad){
		System.out.println(3.14*rad*rad);
	}
}

public class Main{
	public static void main(String[] args) {
		Area A= new Area();
		A.RectangleArea(3,5);
		A.SquareArea(4);
		A.CircleArea(5);
	}
}


//Output
/*
15.0
16.0
78.5
*/