import java.util.Stack;

import javax.swing.tree.TreeNode;

class Node1 {
	int data;
	Node1 left, right;

	Node1(int key) {
		data = key;
		left = right = null;
	}
}

class BSTree {
	/*
	 * Node root;
	 * 
	 * BST() { root = null; }
	 * 
	 * void insertV(int key) { insert(root, key); }
	 */

	static Node1 insert(Node1 root, int key) {
		if (root == null) {
			root = new Node1(key);
			return root;
		} else if (key < root.data) {
			root.left = insert(root.left, key);
		} else {
			root.right = insert(root.right, key);
		}
		return root;
	}

	static void inorderRec(Node1 root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.print(root.data + " ");
			inorderRec(root.right);
		}
	}

}

public class LCA {

	public static void main(String[] args) {

		Node1 root = null;

		BSTree tree = new BSTree();
		root = tree.insert(root, 3);
		root = tree.insert(root, 1);
		root = tree.insert(root, 4);
		root = tree.insert(root, 0);
		root = tree.insert(root, 5);
		root = tree.insert(root, 2);
		root = tree.insert(root, 6);
		root = tree.insert(root, 7);

		tree.inorderRec(root);

		System.out.println();
		
		System.out.println(lca(root, 5, 7));

	}

	static TreeNode lca(Node1 root, int a, int b) {

		Stack<TreeNode> pathToA = pathToX(root, a);
		Stack<TreeNode> pathToB = pathToX(root, b);

		if (pathToA == null || pathToB == null) {
			return null;
		}

		TreeNode value = null;

		while (!pathToA.isEmpty() && !pathToB.isEmpty()) {
			TreeNode x = pathToA.pop();
			TreeNode y = pathToB.pop();
			if (x == y) {
				value = x;
			} else
				return value;
		}

		return null;

	}

	static Stack<TreeNode> pathToX(Node1 root, int x) {

		if (root == null)
			return null;

		if (root.data == x) {
			Stack<TreeNode> path = new Stack<>();
			path.push( (TreeNode) root);
			return path;
		}

		Stack<TreeNode> leftPath = pathToX(root.left, x);
		if (leftPath != null) {
			leftPath.push((TreeNode) root);
			return leftPath;
		}

		Stack<TreeNode> rightPath = pathToX(root.right, x);
		if (rightPath != null) {
			rightPath.push((TreeNode) root);
			return rightPath;
		}

		return null;

	}

}