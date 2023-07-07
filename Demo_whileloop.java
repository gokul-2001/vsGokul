package sample;

import java.util.Scanner;

public class Demo_whileloop {
	public static void main(String[] args) {
		int number,sum = 0;
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter a number an integer below 10: ");
		number =sc.nextInt();
		while(number<=20)
		{
			sum=sum+number;
		    number++;
		    	
		}
			System.out.format("Sum of numbers from the while loop is: %d ",+sum);
			
		
	}

}
