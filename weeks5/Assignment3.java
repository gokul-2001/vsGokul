package weeks5;

import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j;
		try {
			switch(i) {
			case 0:
				int zero = 0;
				j=92;
				break;
			case 1:
				int b[] = null;
				j = b[0];
				break;
			default:
				System.out.println("No Exception");
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
		
	}


