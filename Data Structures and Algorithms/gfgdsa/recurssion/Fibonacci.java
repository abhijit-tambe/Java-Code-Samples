package gfgdsa.recurssion;

public class Fibonacci {
public static int fib(int x) {
	if(x<=2) {
		if(x<=0) return 0;
		else return 1;
	}
	
	
	return fib(x-1)+fib(x-2);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n=20;
			System.out.println(fib(n));
	}
}
