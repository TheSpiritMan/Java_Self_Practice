abstract class Abstract{
	Abstract(){
		System.out.println("This is constructor of abstract class");
	}
	abstract void a_method();

	void method(){
		System.out.println("This is a normal method of abstract class");
	}
}

class SubClass extends Abstract{
		void a_method(){
			System.out.println("This is abstract method");
		}
}

public class Main{
	public static void main(String[] args) {
		SubClass sC = new SubClass();
		sC.a_method();
		sC.method();
	}
}

//Output
/*
This is constructor of abstract class
This is abstract method
This is a normal method of abstract class
*/