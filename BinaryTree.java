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

}
