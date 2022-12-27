public class Student{
	String name;
	Integer roll_no;

	Student(String name,Integer roll_no){
		this.name = name;
		this.roll_no = roll_no;
	}

	public String toString(){
		return name+" "+roll_no;
	}


	public static void main(String[] args) {
		Student student = new Student("TheSpiritMan",38);
		System.out.println(student);
	}
}

//Output
// TheSpiritMan 38