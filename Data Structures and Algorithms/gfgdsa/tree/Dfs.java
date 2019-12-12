/*
 * dfs inorder postorder and preorder
 *   10
 * 	5    20
 * 3 5  15	6	
 * 
 * */


package gfgdsa.tree;

import java.util.LinkedList;
import java.util.Queue;

//class Node{
//	int d;
//	Node l;
//	Node r;
//	public Node(int x) {
//		d=x;
//	}
//}



public class Dfs {

	static Node root;

	public static void inorder(Node n) {
		if(n==null) {
			return;
		}
		inorder(n.l);
		System.out.print(n.d+" ");
		inorder(n.r);
	}
	public static void preorder(Node n) {
		if(n==null) {
			return;
		}
		System.out.print(n.d+" ");
		inorder(n.l);
		
		inorder(n.r);
	}
	public static void postorder(Node n) {
		if(n==null) {
			return;
		}
		inorder(n.l);
		
		inorder(n.r);
		System.out.print(n.d+" ");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n = new Node(10);
		if(root == null) {
		root =n;
		n.l = new Node(5);
		n.r = new Node(20);
		}	
		n.l.l = new Node(3);
		n.l.r = new Node(5);
		n.r.l = new Node(15);
		n.r.r=new Node(6);
//		n.l.l.l = new Node(6);
		System.out.println("dfs : preorder traversal");
		preorder(root);
		System.out.println("\ndfs : inorder traversal");
		inorder(root);
		System.out.println("\ndfs : postorder traversal");
		postorder(root);
		
	
		
		
		
		
		
	}

}
