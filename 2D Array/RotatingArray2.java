
public class RotatingArray2 {

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		int a[][]=rotate(arr, 3);
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}

	static int[][] rotate(int[][] a, int n) {
        // n/2 gives us floor(n/2)
        // and n/2 + n%2 gives us ceiling(n/2)
        for (int i = 0; i < n / 2 + n % 2; i++) {
            for (int j = 0; j < n / 2; j++) {
                int[] tmp = new int[4];
                int currentI = i;
                int currentJ = j;
                for (int k = 0; k < 4; k++) {
                    tmp[k] = a[currentI][currentJ];
                    int[] newCoordinates = rotateSub(currentI, currentJ, n);
                    currentI = newCoordinates[0]; currentJ = newCoordinates[1];
                }
                for (int k = 0; k < 4; k++) {
                    a[currentI][currentJ] = tmp[(k + 3) % 4];
                    int[] newCoordinates = rotateSub(currentI, currentJ, n);
                    currentI = newCoordinates[0]; currentJ = newCoordinates[1];
                }
            }
        }
        return a;
    }

	static int[] rotateSub(int i, int j, int n) {
        int[] newCoordinates = new int[2];
        newCoordinates[0] = j;
        newCoordinates[1] = n - 1 - i;
        return newCoordinates;
    }

}
