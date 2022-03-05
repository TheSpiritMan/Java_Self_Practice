class Shape{
	void message(){
		System.out.println("This is shape");
	}
}

class Rectangle extends Shape{
	void message(){
		System.out.println("This is rectangular shape");
	}

	void printMessage(){
		super.message();
	}
}

class Circle extends Shape{
	void message(){
		System.out.println("This is circular shape");
	}
}

public class Square extends Rectangle{
	void message(){
		System.out.println("Square is a rectangle");
	}
	void recMessage(){
		super.message();
	}

	public static void main(String[] args) {
		Square s = new Square();
		s.recMessage();
		s.printMessage();
	}
}


//Output
/*
This is rectangular shape
This is shape
*/