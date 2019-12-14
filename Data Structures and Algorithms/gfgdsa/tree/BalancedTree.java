/*
 * *		10	
*	4		     6
* 1   3	 	 2	  4 	
*		3
 * 
 * 
 * */


package gfgdsa.tree;

public class BalancedTree {
	static Node root;

public static boolean balanced(Node a) {
	if(a==null) {
		return true;
	}
	int lh = height(a.l);
	int rh = height(a.r);
	if(Math.abs(lh-rh)>1) {
		return false;
		
	}
	else { 
	if(balanced(a.l)&&balanced(a.r)) {
		return true;
	}
	else return false;
	}
}


public static int height (Node b) {
	if(b==null) {
		return 0;
	}
	int lh =height(b.l);
	int rh= height(b.r);
	return Math.max(lh, rh)+1;
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n = new Node(10);
		root = n;
		n.l = new Node(4);
		n.r = new Node(6);
		n.l.l = new Node(1);
		n.l.r = new Node(3);
		n.l.r.l = new Node(3);
//		n.l.r.l.l=new Node(5);
		n.r.l = new Node(2);
		n.r.r = new Node(4);
		System.out.println(balanced(root));

	}

}
