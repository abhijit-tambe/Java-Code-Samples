/*
 * Linked List Insertion
 * Given a key (or data) to be inserted into the linked list of size N. The task is to insert the element at head or tail of the linked list depending on the input just before it p. If p is 0, then insert the element at beginning else insert at end.

Hint : When inserting at the end, make sure that you handle NULL explicitly.

Input Format:
First line of input contains number of testcases T. For each testcase, first line of input contains length of linked list N and next line contains 2*N integers, each element to be inserted into the list is preceded by a 0 or 1 which decide the place to be inserted.

Output Format:
For each testcase, there will be a single line of output which contains the linked list elements.

Your Task:
This is a function problem. You only need to complete the functions insertAtBeginning and insertAtEnd that returns head after successful insertion. The printing is done automatically by the driver code.

Constraints:
1 <= T <= 100
1 <= N <= 103

Example:
Input:
3
5
9 0 5 1 6 1 2 0 5 0
3
5 1 6 1 9 1
4
15 0 36 0 95 0 14 0

Output:
5 2 9 5 6
5 6 9
14 95 36 15

Explanation:
Testcase 1: After inserting the elements at required position, we have linked list as 5, 2, 9, 5, 6.*/package gfgdsa.linkedlist;

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}

public class LinkedListInsertion {
	Node head; // Please do not remove this

	// Should insert a node at the beginning
	void insertAtBeginning(int x) {
		// Your code here
		Node first = new Node(x);
		first.next = head;
		head = first;
	}

	// Should insert a node at the end
	void insertAtEnd(int x) {
		Node newnode = new Node(x);
		Node temp1 = head;
		// Your code here
		if (temp1 == null) {
			head = newnode;
		} else {
			while (temp1.next != null) {
				temp1 = temp1.next;
			}
			temp1.next = newnode;
		}
	}

	// Please do not delete this
	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}
