import java.util.Scanner;
class Product{
	void method(int val1, int val2){
		System.out.println(val1*val2);
	}

	public static void main(String[] args) {
		Product p = new Product();
		Scanner n = new Scanner(System.in);
		int val1 = n.nextInt();
		int val2 = n.nextInt();
		p.method(val1,val2);
	}
}



//Input
//20 50
//Output
//1000