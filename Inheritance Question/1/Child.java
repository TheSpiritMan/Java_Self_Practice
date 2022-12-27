class Parent{
	void parentMethod(){
		System.out.println("This is parent class");
	}
}

public class Child extends Parent{
	void childMethod(){
		System.out.println("This is child class");
	}
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();

		p.parentMethod();
		c.childMethod();
		c.parentMethod();
	}
}


//Output
/*
This is parent class
This is child class
This is parent class
*/