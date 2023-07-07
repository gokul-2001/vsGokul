package closed_book;

import java.util.Scanner;

public class Prime_or_not {
	public static void main(String[] args) {
		int temp;
		boolean isPrime=true;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = scan.nextInt();
		scan.close();
		for(int a =2;a<n/2;a++) {
			temp=n%a;
		if(temp==0)
		{
			isPrime=false;
			break;
		}
		}
		if(isPrime)
			System.out.println(n +" is a prime nummber");
		else
			System.out.println(n + " is not a prime number");
			
	}
	}


