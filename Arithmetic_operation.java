package Assignment;
import java.util.Scanner;
public class Arithmetic_operation {
	int add(int a , int b) {
		return(a + b);
	}
	int sub(int a, int b) {
		return(a - b);
	}
	int mul(int a, int b) {
		return(a * b);
	}
	int div(int a, int b) {
		return(a/b);
	}
	double pow(int a,int b) {
		return(Math.pow(a, b));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Arithmetic_operation obj = new Arithmetic_operation(); 
		System.out.println("Enter two numbers a and b");
		System.out.println("Enter number a: ");
		int a = sc.nextInt();
		System.out.println("Enter number b: ");
		int b = sc.nextInt();
		System.out.println("The sum of a and b are: " +obj.add(a, b));
		System.out.println("The difference of a and b: "+obj.sub(a, b));
		System.out.println("The product of a and b: "+obj.mul(a, b));
		System.out.println("The division of a and b: "+obj.div(a,b));
		System.out.println("The power of a and b: "+obj.pow(a, b));
		
	}

}
