package assignment;

import java.util.Scanner;

public class Raghav {
	public static void main(String[] args) {
		System.out.println("Enter marks to find average");
		Scanner sc = new Scanner(System.in);
		double avg;
		int result;
		int a;
		int b;
		b = sc.nextInt();
		int[] arr = new int[b];
		for (a = 0; a < arr.length; a++) {
			arr[a] = sc.nextInt();
			int max = arr[0];
			double sum = arr[0];
			for (a = 1; a < arr.length; a++) {
				sum = sum + arr[a];
				if (arr[a] > max) {
					max = arr[a];
				}
				result = max;
				avg = sum / (arr.length);
				System.out.println(result);
				System.out.println(avg);

			}
		}

	}
}
