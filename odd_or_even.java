package sample;
import java.util.Scanner;
public class odd_or_even {
	public static void main(String[] args) {
		int num;
		System.out.println("Enter a number: ");
		Scanner number = new Scanner(System.in);
		num = number.nextInt();
		if (num % 2 == 0)
			System.out.println("The number is even ");
		else
			System.out.println("The number is odd ");
	
	}

}
