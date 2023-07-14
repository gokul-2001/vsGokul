package wrapper;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
	public static void division() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number a : ");
			int a = sc.nextInt();
			System.out.println("Enter number b: ");
			int b = sc.nextInt();
			int div = a / b;
			System.out.println(div);

		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (InputMismatchException e) {

			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		division();
	}
}
