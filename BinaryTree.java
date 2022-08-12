package com.binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree<T extends Comparable> {

	BinaryTreeNode root;

	public BinaryTree() {
		root = null;
	}

	public void insert(T data) {
		root = insert(root, data);
	}

	public BinaryTreeNode<T> insert(BinaryTreeNode node, T data) {
		if (node == null) {
			node = new BinaryTreeNode(data);
		} // else {
		if (data.compareTo(node.data) == -1) {
			node.left = insert(node.left, data);
		}
		if (data.compareTo(node.data) == 1) {
			node.right = insert(node.right, data);
		}
		return node;

	}

	public void inorder() {
		inorder(root);
	}

	public void inorder(BinaryTreeNode r) {
		if (r != null) {
			inorder(r.left);
			System.out.print(r.data + " ");
			inorder(r.right);
		}

	}

	public boolean search(T key) {
		return search(root, key);
	}

	public boolean search(BinaryTreeNode root2, T key) {
		if (root2 == null) {
			return false;
		}
		if (root2.data == key) {
			return true;
		}
		boolean res1 = search(root2.left, key);
		if(res1) return false;
		
		boolean res2 = search(root2.right, key);
		return res2;
	}

}
