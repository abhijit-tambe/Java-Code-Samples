/*
 * given a fixed array and multiple queries of following types on the 
 * array how to efficiently perform those queries in O(1) time complexity
 * */


package gfgdsa.arrays;

import java.util.Arrays;

public class PrefixSum {
	 static int a[]= {2,3,8,10,45};

	static int sum[] = new int [a.length];

	static void prefix() {

			sum[0] = a[0];
			for(int i =1;i<a.length;i++) {
				sum[i] = sum[i-1]+a[i];
			}
			System.out.println(Arrays.toString(sum));
	}
	
	static int  findsum(int l,int r) {
		if(l==0) {
			return sum[r];
		}
		int no = sum[r]-sum[l-1]; 
		return no;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prefix();
		int l = 3;
		int r =4;
		System.out.println(findsum(l,r));
	}

}
