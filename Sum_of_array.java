package sample;

public class Sum_of_array {
	public static void main(String[] args) {
		int[] array = {10,30,78,100};
		int sum = 0;
		for(int num:array) {
			sum = sum + num;
			
		}
		System.out.println("Sum of arrays: " +sum);
	}

}
