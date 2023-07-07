package sample;
import java.util.Scanner;
public class multiply_of_numbers {
	public static void main(String args[]) {
		Scanner numbers = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num_1 = numbers.nextInt();
		System.out.println("Enter an another number: ");
		int num_2 = numbers.nextInt();
		int product = num_1 * num_2;
		System.out.println("Product is " +product);
	
	}

}
