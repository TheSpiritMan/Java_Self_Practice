public class Rectangle{
	Integer len, bdth;
	Rectangle(Integer len, Integer bdth){
		this.len = len;
		this.bdth = bdth;
	}

	void Area(){
		System.out.println("Area:"+len*bdth+" "+"Length:"+len+" "+"Breadth:"+bdth);
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle(4,5);
		Rectangle s = new Rectangle(5,8);

		r.Area();
		s.Area();
	}
}

//Output
/*
Area:20 Length:4 Breadth:5
Area:40 Length:5 Breadth:8
*/