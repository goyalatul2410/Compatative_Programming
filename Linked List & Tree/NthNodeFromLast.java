class Nodes {
	int data;
	Nodes next;

	public Nodes(int d,Nodes n)
    {
        data = d;
        next = n;
    }
}

public class NthNodeFromLast {

	public static void main(String[] args) {

		Nodes current = new Nodes(9, null);
		for (int i = 8; i >1; i--) {
			current = new Nodes(i, current);
		}
		Nodes head = current;
		Nodes ans = nthFromLast(head, 3);
		System.out.println(ans.data);

	}

	public static Nodes nthFromLast(Nodes head, int n) {
		if (head == null)
			return null;
		Nodes left = head;
		Nodes right = head;
		for (int i = 0; i < n; i++) {
			if (right == null)
				return null;
			right = right.next;
		}
		while (right != null) {
			right = right.next;
			left = left.next;
		}
		return left;
	}

}
