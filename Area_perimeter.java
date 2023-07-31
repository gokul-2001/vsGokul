package assignment;

import java.util.Scanner;

public class Area_perimeter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		double perimeter;
		double area;
		if (radius <= 0) {
			System.out.println("Enter non zero");
		} else {
			perimeter = 2 * Math.PI * radius;
			area = Math.PI * radius * radius;
			System.out.println(perimeter);
			System.out.println(area);
		}
	}

}
