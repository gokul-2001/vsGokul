package sample;
import java.util.Scanner;
public class Area_of_square {
	public static void main(String[] args) {
		System.out.println("side of square: ");
		Scanner sc = new Scanner(System.in);
		int side = sc.nextInt();
		int area = side * side;
		System.out.println("area of square: "+area);
	}

}
