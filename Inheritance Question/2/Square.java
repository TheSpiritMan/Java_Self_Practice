class Rectangle{
	int length, breadth;

	Rectangle(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}

	void area(){
		System.out.println(length*breadth);
	}
	void perimeter(){
		System.out.println(length+breadth);
	}
}

public class Square extends Rectangle{
		Square(int side){
			super(side,side);
		}

	public static void main(String[] args) {
		Rectangle r = new Rectangle(20,30);
		Square sq = new Square(40);

		r.area();
		r.perimeter();
		sq.area();
		sq.perimeter();
	}
}




//Output
/*
600
50
1600
80
*/