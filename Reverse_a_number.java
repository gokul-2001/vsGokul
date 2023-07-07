package sample;

import java.util.Scanner;

public class Reverse_a_number {
	public static void main(String[] args) {
		int num = 0;
		int reversenum = 0;
		System.out.println("Enter a nuber to be reversed");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		while(num != 0)
		{
			reversenum = reversenum * 10;
			reversenum = reversenum + num%10;
			num = num/10;
		}
		System.out.println("reverse of given number: " +reversenum);
	}

}
