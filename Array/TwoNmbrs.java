import java.util.ArrayList;
import java.util.Scanner;

public class TwoNmbrs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int s = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<Integer> nmbrs = new ArrayList<>();
		for (int i = 1; i <= m / 2; i++) {
			if (m % i == 0) {
				nmbrs.add(i);
			}
		}
		int x, y;
		for (int i = 0; i < nmbrs.size(); i++) {
			x = a - nmbrs.get(i);
			if (nmbrs.contains(x)) {
				y = nmbrs.get(i);
				if (x - y == s || y - x == s) {
					System.out.println(x + " " + y);
					break;
				}
			}
		}
		sc.close();
	}
}