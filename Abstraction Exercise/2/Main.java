abstract class Bank{
	Integer balance;
	abstract void getBalance();
}

class BankA extends Bank{
	void getBalance(){
		System.out.println("$100");
	}
}

class BankB extends Bank{
	void getBalance(){
		System.out.println("$150");
	}
}

class BankC extends Bank{
	void getBalance(){
		System.out.println("$200");
	}
}

public class Main{
	public static void main(String[] args) {
		BankA a = new BankA();
		BankB b = new BankB();
		BankC c = new BankC();

		a.getBalance();
		b.getBalance();
		c.getBalance();
	}
}

//Output
/*
$100
$150
$200
*/