package gfgdsa.recurssion;

public class FactorialRec {
	public static int fact(int n) {
		if(n==1) {
			return 1;
		}
		else return n*fact(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ab = fact(6);
		System.out.println(ab);
	}

}
