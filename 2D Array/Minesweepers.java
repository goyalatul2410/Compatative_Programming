
public class Minesweepers {

	public static void main(String[] args) {
		int a[][] = { { 0, 0 }, { 0, 1 } };

		int arr[][] = mines(a, 3, 4);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

	static int[][] mines(int bomb[][], int row, int col) {

		int arr[][] = new int[row][col];
		for (int[] bombs : bomb) {
			int row_i = bombs[0];
			int col_i = bombs[1];
			arr[row_i][col_i] = -1;
			for (int i = row_i - 1; i <= row_i + 1; i++) {
				for (int j = col_i - 1; j <= col_i + 1; j++) {
					if (0 <= i && i < row && 0 <= j && j < col && arr[i][j] != -1) {
						arr[i][j]++;
					}
				}
			}
		}
		return arr;
	}
}
