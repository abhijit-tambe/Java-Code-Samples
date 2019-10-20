package gfgdsa.mathematics;

import java.util.Scanner;

public class Gp {

 
	public static double findNthTerm(int A,int B,int N,int N1) {
		double r = (double)B/(double)A;
		System.out.println("r"+r);
		if(Math.floor(r)<1.0) {
        	System.out.println("sum is "+(A/(1-r)));
        }
		else
		System.out.println("sum is "+(A*((Math.pow(r, N1)-1)))/(r-1));
        
		
		
		
		return (double)A*Math.pow(r,N-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int A =sc.nextInt();
		int B =sc.nextInt();
		int N =sc.nextInt();
		int N1 =sc.nextInt();
		int nth;
		nth = (int) findNthTerm(A,B,N,N1);
		System.out.println(nth);

	}

}
