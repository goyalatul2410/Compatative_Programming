
public class RotatingArray1 {

	public static void main(String[] args) {
		
		int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int a[][]=rotate(arr, 4);
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
	static int[][] rotate(int[][] arr,int n) {
		int rotated[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				rotated[j][n-i-1]=arr[i][j];
			}
		}
		return rotated;
	}

}
