package week4;
import static java.lang.System.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		System.out.println("Enter course name:");
		Scanner sc = new Scanner(System.in);
		String CourseName = sc.nextLine();
		System.out.println("Course: "+CourseName);
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("BMW");
		cars.add("volvo");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println(cars);
	}

}
