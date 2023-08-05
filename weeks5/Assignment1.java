package weeks5;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		 a = sc.nextInt();
		 b = sc.nextInt();
		try {
			 int result = a/b;
			System.out.println(result);
		}
		catch(ArithmeticException e){
			System.out.println("Exception:Division by zero");
			
		}
	}

}
