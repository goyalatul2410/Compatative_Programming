import java.util.ArrayDeque;

public class MineSweeper2 {

	public static void main(String[] args) {
		int arr[][] = { { -1, 1, 0, 0 }, { 1, 1, 0, 0 }, { 0, 0, 1, 1 }, { 0, 0, 1, -1 } };

		int a[][] = click(arr, 4, 4, 1, 2);

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}

	}

	static int[][] click(int[][] arr, int row, int col, int co_r, int co_c) {

		ArrayDeque<int[]> que = new ArrayDeque<>();
		if (arr[co_r][co_c] == 0) {
			arr[co_r][co_c] = -2;
			int[] cordinates = { co_r, co_c };
			que.add(cordinates);
		} else
			return arr;
		while (!que.isEmpty()) {
			int[] current_co = que.remove();
			int cur_i = current_co[0];
			int cur_j = current_co[1];
			for (int i = cur_i - 1; i <= cur_i + 1; i++) {
				for (int j = cur_j - 1; j <= cur_j + 1; j++) {
					if (0 <= i && i < row && 0 <= j && j < col && arr[i][j] == 0) {
						arr[i][j] = -2;
						int[] cordinates = { i, j };
						que.add(cordinates);
					}
				}
			}
		}
		return arr;
	}
}
