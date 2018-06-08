import java.util.ArrayList;
import java.util.HashMap;;

public class MultipleOf20 {
	public static void main(String args[]) {
		int a[] = { 2, 4, 1, 6, 5, -1 };
		/*for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i] * a[j] == 20)
					System.out.println(a[i] + " " + a[j]);
			}
		}*/
		ArrayList<Integer> arr= new ArrayList<>();
		for(int i=0;i<a.length;i++) 
			arr.add(a[i]);
		int x = 0,y = 0;
		for(int i=0;i<arr.size();i++) {
			x=20/(arr.get(i));
			if(arr.contains(x)) {
				y=arr.get(i);
				break;
			}
		}
		System.out.println(x+" "+y);
	}
}
