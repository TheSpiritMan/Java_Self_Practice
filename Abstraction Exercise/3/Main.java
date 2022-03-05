abstract class Marks{
	abstract void getPercentage();
}

class A extends Marks{
	float m1, m2, m3;
	A(float mark1, float mark2, float mark3){
		this.m1 = mark1;
		this.m2 = mark2;
		this.m3 = mark3;
	}

	void getPercentage(){
		System.out.println(((m1+m2+m3)/300)*100+"%");
	}
}

class B extends Marks{
	float m1, m2, m3, m4;
	B(float mark1, float mark2, float mark3, float mark4){
		this.m1 = mark1;
		this.m2 = mark2;
		this.m3 = mark3;
		this.m4 = mark4;
	}

	void getPercentage(){
		System.out.println(((m1+m2+m3+m4)/400)*100+"%");
	}
}

public class Main{
	public static void main(String[] args){
		A a = new A(80,90,70);
		B b = new B(50,75,95,60);
		a.getPercentage();
		b.getPercentage();
	}
}




//Output
/*
80.0%
70.0%
*/