package sample;
import java.util.Scanner;
public class area_of_retangle {
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter the length of Rectangle:");  
		 int length = scanner.nextInt();
		 System.out.println("Enter the width of Rectangle:");  
		 int width = scanner.nextInt();
		int area = length*width;
		 System.out.println("Area of Rectangle is:"+area);
	
	}
}
	

