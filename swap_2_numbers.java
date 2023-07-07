package sample;

public class swap_2_numbers {
	public static void main(String[] args) {
		int a = 4, b = 6;
		System.out.println("Before swap");
		System.out.println("value a: "+a);
		System.out.println("value b: "+b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After swap");
		System.out.println("value a: "+a);
		System.out.println("value b: "+b);
		
	}

}
