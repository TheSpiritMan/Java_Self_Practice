public class AddDistance{

		void add(Integer val1, Integer val2){
			System.out.println((val1+val2)/12+"Ft. "+(val1+val2)%12+"inch");
		}

	public static void main(String[] args) {
		AddDistance a = new AddDistance();

		a.add(21,55);
	}
}

//Output
// 6Ft. 4inch