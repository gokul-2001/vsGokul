package week4;
interface First {
	default void show() {
		System.out.println("Default implementation of first interface");
		
	}
}
interface Second {
	default void show() {
		System.out.println("Default implementation of second interface");
	}
	
}
public class Assignment4 implements First,Second {
	public void show() {
		First.super.show();
		Second.super.show();
	}
	public static void main(String[] args) {
		Assignment4 a = new Assignment4();
		a.show();
		
	}
	

}
