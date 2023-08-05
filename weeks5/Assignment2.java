package weeks5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] a = new  int[length];
		int sum = 0;
		try {
			for(int i=0;i<length;i++) {
				int userinput = sc.nextInt();
				a[i]=userinput;
				sum = sum + a[i];
				
			}
			System.out.println(sum);
		}
		catch(InputMismatchException e){
			System.out.println("you entered bad data");
		}
	}

}
