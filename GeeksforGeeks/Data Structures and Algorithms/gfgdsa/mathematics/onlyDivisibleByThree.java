package gfgdsa.mathematics;

import java.util.Scanner;

public class onlyDivisibleByThree {

	
	
//	public static int divisible(int n) {
//		
//		int count=0;
//		
		//too high time complexity
//		for(int i=1;i<n;i++) {
//			int d=0;
//			for(int j=1;j<=i;j++) {	
//			if(i%j==0) {
//			d++;
//			}	
//			}
//			if(d==3) {
//				count++;
//			}
//		}
//		int b[] = new int[count];
//		for(int i=0;i<b.length;i++) {
//			if(b[i])
//		}
//		return count;
//	}
	
	public static boolean isPrime(int n,int c) {
		if(c==n) {
			return true;
		}
		else if(n%c==0) {
			return false;
		}
		else return isPrime(n,c+1);	
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0) {
		int A =sc.nextInt();
//		System.out.println(divisible(A));
		int count =0;
		for(int i=2;i*i<=A;i++) {
			if(isPrime(i,2)) {
				count++;
			}
			else continue;
		}
		
		System.out.println(count);
		
		
		}
	}

}
