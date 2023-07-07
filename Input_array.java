package sample;
import java.util.Scanner;
public class Input_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		int sum = 0;
		System.out.println("Enter elements: ");
		for(int a = 0; a<5; a++)
		{
			array[a] = sc.nextInt();
		}
		for(int num : array)
		{
			sum = sum + num;
		}
		System.out.println("sum_of-arrays: "+sum);
	}

}
