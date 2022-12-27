public class Employee{
	String name;
	Integer yr_of_join;
	String address;

	Employee(String name,Integer yr_of_join,String address){
		this.name = name;
		this.yr_of_join = yr_of_join;
		this.address = address;
	}

	public String toString(){
		return name+"         "+yr_of_join+"            "+address;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("Robert",1994,"64C- WallsStreat");
		Employee e2 = new Employee("Sam",2000,"68D- WallsStreat");
		Employee e3 = new Employee("John",1999,"26B- WallsStreat");

		System.out.println("Name       Year of joining         Address");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}
}


//Output
/*
Name       Year of joining         Address
Robert         1994            64C- WallsStreat
Sam         2000            68D- WallsStreat
John         1999            26B- WallsStreat
*/