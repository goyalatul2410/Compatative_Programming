class Node {
	int data;
	Node left, right;

	Node(int key) {
		data = key;
		left = right = null;
	}
}

class BST {
	/*
	 * Node root;
	 * 
	 * BST() { root = null; }
	 * 
	 * void insertV(int key) { insert(root, key); }
	 */

	static Node insert(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		} else if (key < root.data) {
			root.left = insert(root.left, key);
		} else {
			root.right = insert(root.right, key);
		}
		return root;
	}

	/*static void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.print(root.data + " ");
			inorderRec(root.right);
		}
	}*/
}

public class BstOrNot {

	public static void main(String[] args) {

		Node root = null;

		BST tree = new BST();
		root = tree.insert(root, 3);
		root = tree.insert(root, 1);
		root = tree.insert(root, 4);
		root = tree.insert(root, 0);
		root = tree.insert(root, 5);
		root = tree.insert(root, 2);
		root = tree.insert(root, 6);

		//tree.inorderRec(root);

		//System.out.println();
		
		System.out.println(isBST(root, null, null));
	}

	static Boolean isBST(Node node, Integer low, Integer up) {
		if (low != null && node.data < low)
			return false;
		if (up != null && node.data > up)
			return false;
		boolean left_bst = true;
		boolean right_bst = true;

		if (node.left != null)
			left_bst = isBST(node.left, low, node.data);
		else if (left_bst && node.right != null)
			right_bst = isBST(node.right, node.data, up);
		return left_bst && right_bst;
	}

}