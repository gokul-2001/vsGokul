package coreAssignment3;

import java.util.Scanner;

abstract class Shape {
	abstract void calculateArea();

	Scanner sc = new Scanner(System.in);

}

class Rectangle extends Shape {

	@Override
	void calculateArea() {
		System.out.println("Enter Length: ");
		int l = sc.nextInt();
		System.out.println("Enter Breadth: ");
		int b = sc.nextInt();
		int area = l * b;
		System.out.println("AREA: " + area);

	}

}

class Circle extends Shape {
	void calculateArea() {
		System.out.println("Enter radius of circle: ");
		int r = sc.nextInt();
		double area = 3.14 * r * r;
		System.out.println("Area: " + area);
	}
}