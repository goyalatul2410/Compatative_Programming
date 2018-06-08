import java.util.HashMap;

public class MostFrequent {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 2, 3, 2, 2 };

		System.out.println(frequent(arr));
	}

	static Integer frequent(int arr[]) {
		int max = -1;
		int maxItem = 0;
		HashMap<Integer, Integer> count = new HashMap<>();
		for (int i : arr) {
			if (count.containsKey(i)) {
				Integer newV = count.get(i)+1;
				count.put(i, newV);

			} else {
				count.put(i, 1);
			}
			if (count.get(i) > max) {
				max = count.get(i);
				maxItem = i;
			}
		}
		return maxItem;
	}

}
