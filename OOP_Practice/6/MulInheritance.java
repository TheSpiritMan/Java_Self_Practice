interface MyInterface1{
   public default void display() {
      System.out.println("display method of MyInterface1");
   }
}
interface MyInterface2{
   public default void display() {
      System.out.println("display method of MyInterface2");
   }
}

public class MulInheritance implements MyInterface1, MyInterface2{
   public void display() {
      System.out.println("This is the implementation of the display method");
   }
   public void show() {
      MyInterface1.super.display();
      MyInterface2.super.display();
   }

   public static void main(String args[]) {
      MulInheritance obj = new MulInheritance();
      obj.display();
      obj.show();
   }
}