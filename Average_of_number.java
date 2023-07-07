package closed_book;
import java.util.Scanner;
public class Average_of_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int sum = 0,a;
		for(a=0; a<=n;a++) {
			a = sc.nextInt();
			sum += a;
			
		}
		System.out.println("The average of numbers: "+sum/n);
		
		
	}

}
