/*
 * Given two arrays A and B of size N and M respectively. The task is to find union between these two arrays.

Union of the two arrays can be defined as the set containing distinct elements from both the arrays. If there are repetitions, then only one occurrence of element should be printed in union.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consist of three lines. The first line of each test case contains two space separated integers N and M, where N is the size of array A and M is the size of array B. The second line of each test case contains N space separated integers denoting elements of array A. The third line of each test case contains M space separated integers denoting elements of array B.

Output:
Correspoding to each test case, print the count of union elements of the two arrays.

Constraints:
1 ≤ T ≤ 100
1 ≤ N, M ≤ 105
1 ≤ A[i], B[i] < 105

Example:
Input:
2
5 3
1 2 3 4 5
1 2 3
6 2
85 25 1 32 54 6
85 2

Output:
5
7
 * */

package gfgdsa.hashing;


	import java.util.*;
	import java.lang.*;
	import java.io.*;
	public class UnionOfTwoArray {
	 
	     
	    static void  check (ArrayList<Integer> a,ArrayList<Integer> b){
	        // TreeSet<Long> c = new TreeSet<>(a);
	        // c.addAll(b);
	        // System.out.println(c.size());
	        HashMap<Integer,Integer> h = new HashMap<>();
	        for(int x:a){
	            h.put(x, h.getOrDefault(x, 0)+1);
	        }
	        for(int x:b){
	            // h.add(x);
	            h.put(x,h.getOrDefault(x,0)+1);
	        }
	        System.out.println(h);
	    }
		public static void main (String[] args)
		 {
		 //code
		 Scanner sc = new Scanner(System.in);
			 int  t = sc.nextInt();
			 while(t-->0){
			     int n= sc.nextInt();
			  int m= sc.nextInt();
			  ArrayList<Integer> a = new ArrayList<>(n);
			     for(int i =0;i<n;i++){
			  a.add(sc.nextInt());
			     }
			      ArrayList<Integer> b = new ArrayList<>(m);
			     for(int i =0;i<m;i++){
			  b.add(sc.nextInt());
			     }
			     check(a,b);
		 }
	}
	
}
