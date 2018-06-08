import java.util.ArrayList;

public class CommonElement {

	public static void main(String[] args) {
		int a[] = { 1, 3, 4, 6, 7, 9 };
		int b[] = { 1, 2, 4, 5, 9, 10 };

		Integer[] r = common(a,b);
		for (int i : r)
			System.out.print(i + "  ");
	}

	static Integer[] common(int a[], int b[]) {

		int p1 = 0, p2 = 0;

		ArrayList<Integer> result = new ArrayList<>();
        while(p1 < a.length && p2 < b.length){
            if (a[p1] == b[p2]) {
                result.add(a[p1]);
                p1 += 1;
                p2 += 1;
            }
            else if (a[p1] > b[p2]) {
                p2 += 1;
            } else {
                p1 += 1;
            }
        }
        // Convert the result to a regular array.
        Integer[] resultInArray = new Integer[result.size()];
        return result.toArray(resultInArray);
	}

}
