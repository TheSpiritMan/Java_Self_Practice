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
	Area[] arr = new Area[5];
			
			arr[0] = new Area();
			arr[0].RectangleArea(1,3);

			arr[1] = new Area();
			arr[1].RectangleArea(2,3);
			
			arr[2] = new Area();
			arr[2].RectangleArea(3,6);
			
			arr[3] = new Area();
			arr[3].RectangleArea(9,7);

			arr[0].SquareArea(5);
			arr[1].SquareArea(3);
			arr[2].SquareArea(6);
			arr[3].SquareArea(8);

			arr[0].CircleArea(3);
			arr[1].CircleArea(4);
			arr[2].CircleArea(6);
			arr[3].CircleArea(5);

			arr[4] = new Area();
			arr[4].CircleArea(8);
		}
	}




//Output
/*
3.0
6.0
18.0
63.0
25.0
9.0
36.0
64.0
28.259999999999998
50.24
113.03999999999999
78.5
200.96

*/