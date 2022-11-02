package com.practice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree intTree = new Tree();
		intTree.insert(25);
		intTree.insert(20);
		intTree.insert(15);
		intTree.insert(27);
		intTree.insert(30);
		intTree.insert(29);
		intTree.insert(26);
		intTree.insert(22);
		intTree.insert(32);
		System.out.println("inorder");

		intTree.traverseInOrder();
		System.out.println();
//		System.out.println(intTree.Search(27));
//		System.out.println(intTree.Search(17));
//		System.out.println(intTree.Search(8888));
//		System.out.println(" preorder ");
//		intTree.preOrder();
//		System.out.println();
//
//		System.out.println(" postorder ");
//		intTree.posOrder();

		intTree.delete(15);
		System.out.println();
		System.out.println("inorder After delete 15");

		intTree.traverseInOrder();
	}

}
