package sample;
import java.util.Scanner;
public class floyds_tringle {
	public static void main(String[] args) {
		int rows,number=1,counter,j;
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter no of rows: ");
		rows = user_input.nextInt();
		System.out.println("****************");
		 for ( counter = 1 ; counter <= rows ; counter++ ){
		 {
		 for ( j = 1 ; j <= counter ; j++ )
		 {
		 System.out.print(number+" ");
		number++;
		 }
		 System.out.println();
	}

}
}
}
