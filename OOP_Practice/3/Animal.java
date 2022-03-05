interface AnimalEat{
	void eat();
}

interface AnimalTravel{
	void travel();
}


public class Animal implements AnimalEat, AnimalTravel{

	public void eat(){
		System.out.println("Animal Eating");
	}

	public void travel(){
		System.out.println("Animal Travelling");
	}
	public static void main(String[] args) {
		Animal a = new Animal();
		a.eat();
		a.travel();
	}
}

//Output
//Animal Eating
//Animal Travelling

