/*
 * 
 * 
 * Given two arrays A and B of equal size N, the task is to find if given arrays are equal or not. Two arrays are said to be equal if both of them contain same set of elements, arrangements (or permutation) of elements may be different though.
Note : If there are repetitions, then counts of repeated elements must also be same for two array to be equal.

Input:
The first line of input contains an integer T denoting the no of test cases. Then T test cases follow.  Each test case contains 3 lines of input. The first line contains an integer N denoting the size of the array. The second line contains element of array A[]. The third line contains elements of the array B[].

Output:
For each test case, print 1 if the arrays are equal else print 0.

Constraints:
1<=T<=100
1<=N<=107
1<=A[],B[]<=1018

Example:
Input:
2
5
1 2 5 4 0
2 4 5 0 1
3
1 2 5
2 4 15

Output:
1
0

Explanation:
Testcase1:
Input : A[] = {1, 2, 5, 4, 0}; B[] = {2, 4, 5, 0, 1};
Output : 1

Testcase2:
Input : A[] = {1, 2, 5}; B[] = {2, 4, 15};
Output : 0
 * */

package gfgdsa.hashing;


	import java.util.*;
	import java.lang.*;
	import java.io.*;
	public class EqualArray {
	 
	     
	     
	    static void  check(ArrayList<Long> a,ArrayList<Long> b){
	        
	        HashMap<Long,Integer> af = new HashMap<>();
	        HashMap<Long,Integer> bf = new HashMap<>();
	        
	        for(Long x :a){
	            af.put(x,af.getOrDefault(x,0)+1);
	        }
	        for(Long x :b){
	            bf.put(x,bf.getOrDefault(x,0)+1);
	        }
	        int result = 1;
	        for(Long x :af.keySet()){
	        
	            if(af.get(x)!=bf.get(x)){
	                result=0;
	                break;
	            }
	        }
	        
	        
	         System.out.println(result);
	    }
	     
	     
		public static void main (String[] args)
		 {
		 //code
		 Scanner sc = new Scanner(System.in);
			 int  t = sc.nextInt();
			 while(t-->0){
			     int n= sc.nextInt();
			  
			  ArrayList<Long> a = new ArrayList<>(n);
			  
			  ArrayList<Long> b = new ArrayList<>(n);
			     for(int i =0;i<n;i++){
			  			  a.add(sc.nextLong());
			     }
			     for(int i =0;i<n;i++){
			  
			  b.add(sc.nextLong());
			     }
			     check(a,b);
			 }

		 }
	}

