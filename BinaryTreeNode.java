package com.binaryTree;

import java.util.Scanner;

public class BinaryTreeNode<T> {

	// Scanner sc = new Scanner(System.in);
	T data;
	// BinaryNode head = null;
	BinaryTreeNode<T> left = null;
	BinaryTreeNode<T> right = null;

	public BinaryTreeNode(T data) {

		this.data = data;
		this.left = left;
		this.right = right;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public BinaryTreeNode<T> getLeft() {
		return left;
	}

	public void setLeft(BinaryTreeNode<T> left) {
		this.left = left;
	}

	public BinaryTreeNode<T> getRight() {
		return right;
	}

	public void setRight(BinaryTreeNode<T> right) {
		this.right = right;
	}

	// private BinaryNode pointer = null;

	/*
	 * public void append(BinaryNode<T> newnode) { if(head == null && tail == null)
	 * { head = newnode; tail = newnode; temp = newnode; }else {
	 * temp.setNext(newnode); tail = newnode; tail.setNext(null); temp = newnode; }
	 * }
	 * 
	 * /*public void add(BinaryNode<T> newnode) { if(head == null && tail == null) {
	 * head = newnode; tail = newnode; temp = newnode; }else { temp = newnode;
	 * temp.setNext(head); head = newnode; } }
	 */

	/*
	 * public void insert(BinaryNode<T> newnode ,BinaryNode<T> oldnode) { pointer =
	 * head; int flag = 0; while(pointer != null) { if(pointer.getKey() ==
	 * oldnode.getKey()) { newnode.setNext(pointer.getNext());
	 * pointer.setNext(newnode); flag++; } pointer = pointer.getNext(); //return
	 * head; } if(flag == 0) { System.out.println("Node does not exist"); } }
	 * 
	 * public void search(BinaryNode<T> searchnode) { pointer = head; int flag = 0;
	 * while(pointer != null) { if(pointer.getKey() == searchnode.getKey()) {
	 * System.out.println(searchnode.toString() +" is find at "+flag+ " position");
	 * } flag++; pointer = pointer.getNext(); } if(flag == 0) {
	 * System.out.println("Node does not exist"); } }
	 * 
	 * public void removeFirstelement() { pointer = head;
	 * //System.out.println(pointer + "is deleted"); //pointer.setNext(head); head =
	 * pointer.getNext(); }
	 * 
	 * public void removeLastelement() { pointer = head; while(pointer.getNext() !=
	 * tail) { //System.out.println(pointer + "is deleted"); pointer =
	 * pointer.getNext(); } pointer.setNext(null); pointer = tail; }
	 * 
	 * public void removeTheGivenElement(BinaryNode<T> givenElement) { pointer =
	 * head; int flag = 0; while(pointer != null) { temp = pointer; pointer =
	 * pointer.getNext(); if(pointer.getKey() == givenElement.getKey()) {
	 * temp.setNext(pointer.getNext()); removeTheGivenElement(pointer); } flag++; }
	 * if(flag == 0) { System.out.println("Node does not exist"); }
	 */
	// }

}
