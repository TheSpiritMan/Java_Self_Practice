import java.util.Scanner;
public class Complex{

	void sum(Integer r1, Integer i1, Integer r2, Integer i2){
		System.out.printf("%d %di",r1+r2,i1+i2);
	}

	void difference(Integer r1, Integer i1, Integer r2, Integer i2){
		System.out.printf("\n%d %di",r2-r1,i2-i1);
	}

	void product(Integer r1, Integer i1, Integer r2, Integer i2){
		System.out.printf("\n%d %di",(r1*r2)-(i1*i2),(r1*i2)+(r2*i1));
	}


	public static void main(String[] args) {
		Complex c = new Complex();

		Scanner sc = new Scanner(System.in);
		Integer real1 = sc.nextInt();
		Integer img1 = sc.nextInt();
		Integer real2 = sc.nextInt();
		Integer img2 = sc.nextInt();
		

		c.sum(real1,img1,real2,img2);
		c.difference(real1,img1,real2,img2);
		c.product(real1,img1,real2,img2);
	}
}


//Input
// 2 1 3 2

//Output
/*
5 3i
1 1i
4 7i
*/