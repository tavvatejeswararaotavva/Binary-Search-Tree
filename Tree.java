package com.practice;

public class Tree {
	private TreeNode root;

	public void insert(int value) {
		if (root == null) {
			root = new TreeNode(value);
		} else {
			root.insert(value);
		}
	}

	public int Search(int value) {
		if (root != null) {
			return root.Search(value);
		}
		return -1;
	}

	public void delete(int value) {

		root = delete(root, value);
	}

// case1 : node has no  child
//case2 :node has one child
	private TreeNode delete(TreeNode root, int value) {
		if (root == null) {
			return root;
		}

		if (value < root.getData()) {
			root.setLeftChild(delete(root.getLeftChild(), value));
		} else if (value > root.getData()) {
			root.setRightChild(delete(root.getRightChild(), value));
		} else {

			if (root.getLeftChild() == null) {
				return root.getRightChild();
			} else if (root.getRightChild() == null) {

				return root.getLeftChild();

			}

			root.setData(root.getRightChild().min());
			root.setRightChild(delete(root.getRightChild(), root.getData()));

		}

		return root;
	}

	public int min() {
		if (root == null) {
			return Integer.MIN_VALUE;
		} else {
			return root.min();
		}
	}

	public void traverseInOrder() {
		if (root != null) {
			root.traverseInOrder();
		}
	}

	public void preOrder() {
		if (root != null) {
			root.preOrder();
		}
	}

	public void posOrder() {
		if (root != null) {
			root.posOrder();
		}
	}
}
