public class Student{

	Integer roll_no;
	Integer phn_no;
	String address;

	Student(String name,Integer roll, Integer phn, String add){
		this.roll_no = roll;
		this.phn_no = phn;
		this.address = add;
	}

	public String toString(){
		return roll_no+" "+phn_no+" "+address;
	}

	public static void main(String[] args) {
		Student A = new Student("Sam",38,98888888,"Ktm");
		Student B = new Student("John",26,9777777,"Pkr");
		
		System.out.println(A);
		System.out.println(B);
	}
}


//Output
/*
38 98888888 Ktm
26 9777777 Pkr
*/