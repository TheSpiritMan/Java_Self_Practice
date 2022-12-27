abstract class Parent{
	abstract void message();
}

class Child1 extends Parent{
	void message(){
		System.out.println("This is first subclass");
	}
}

class Child2 extends Parent{
	void message(){
		System.out.println("This is second subclass");
	}
}

public class Main{
	public static void main(String[] args){
		Child1 a = new Child1();
		Child2 b = new Child2();

		a.message();
		b.message();

	}
}



//Output
/*
This is first subclass
This is second subclass
*/