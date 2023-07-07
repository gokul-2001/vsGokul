package closed_book;

public class Two_dimensional_array {
	public static void main(String[] args) {
		int[][] matrix = new int[4][4];
		for(int i = 0;i < matrix.length;i++) {
			for(int j = 0;j < matrix[i].length;j++) {
				matrix[i][j] = i * 4 + j + 1;
			}
		}
		for(int i = 0;i< matrix.length;i++) {
			for(int j = 0;j < matrix[i].length;j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
