package com.binaryTree;

import java.util.Scanner;

public class BinarySearchTree<T> {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BinaryTree bst = new BinaryTree();
		System.out.println("Linked List Binary Search Tree Test\n");
		int ch = 0;
		do {
			System.out.println("\nEnter integer element to insert");
			bst.insert(sc.nextInt());
			System.out.println("\nIn order");
			bst.inorder();
			ch++;
		}while(ch < 4);
		System.out.println("Enter the value to be search");
		Integer data = sc.nextInt();
		if(bst.search(data))
			System.out.println("yes");
		else
			System.out.println("No");
	}
}
