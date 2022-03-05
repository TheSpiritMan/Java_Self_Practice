import java.util.Scanner;
public class Average{
	void cal(Float a, Float b, Float c){
		System.out.println((a+b+c)/3);
	}

	public static void main(String[] args) {
		Average a = new Average();
		Scanner sc = new Scanner(System.in);
		Float d = sc.nextFloat();
		Float e = sc.nextFloat();
		Float f = sc.nextFloat();

		a.cal(d,e,f);
	}
}



//Input
//2 3 5

//Output
//3.333333