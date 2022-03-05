public class Overload{
	void talk(){
		System.out.println("Hello");
	} 
	void talk(String name){
		System.out.println("Hello" + name);
	}

	public static void main(String[] args) {
		Overload oL = new Overload();
		oL.talk();
		oL.talk(" TSM");
	}
}


//Output
// Hello
// Hello TSM