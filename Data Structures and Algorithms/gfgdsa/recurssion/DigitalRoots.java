package gfgdsa.recurssion;

public class DigitalRoots {
	public static int as (int x) {
		if(x<10) {
			return x;
		}
		
			return as(x/10+x%10);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =99999;
		System.out.println();
		int a = as(x);
//		while(a>10) {
//			a = as(a);
//		}
		System.out.println(a);
}}
