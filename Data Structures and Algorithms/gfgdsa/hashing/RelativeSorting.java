/*
 *Given two arrays A1[] and A2[] of size N and M respectively. The task is to sort A1 in such a way that the relative order among the elements will be same as those in A2. For the elements not present in A2, append them at last in sorted order. It is also given that the number of elements in A2[] are smaller than or equal to number of elements in A1[] and A2[] has all distinct elements.

Note: Expected time complexity is O(N log(N)).

Input:
First line of input contains number of testcases. For each testcase, first line of input contains length of arrays N and M and next two line contains N and M elements respectively.

Output:
Print the relatively sorted array.

Constraints:
1 ≤ T ≤ 100
1 ≤ N,M  ≤ 106
1 ≤ A1[], A2[] <= 106

Example:
Input:
1
11 4
2 1 2 5 7 1 9 3 6 8 8
2 1 8 3

Output:
2 2 1 1 8 8 3 5 6 7 9

Explanation:
Testcase 1: Array elements of A1[] are sorted according to A1[].
  
 * */

package gfgdsa.hashing;
import java.util.*;
import java.lang.*;
import java.io.*;

public class RelativeSorting {

	     
	     
	    public static void relsort(int[] a, int b []){
	        HashMap<Integer,Integer>  freq = new HashMap<>();
	        ArrayList <Integer> list = new ArrayList<>(); 
	        int result [] =  new int [a.length];
	        for(int i=0 ;i<result.length;i++){
	            result[i]=0;
	        }
	        for(int x: a){
	            freq.put(x,freq.getOrDefault(x,0)+1);
	        }
	        int i=0;
	        for(int x : b){
	            int c = freq.get(x);
	            freq.remove(x);
	            while(c!=0){
	                result[i]=x;
	                c--;
	                i++;
	            }
	            // }
	        }
	        for(int x : freq.keySet()){
	            list.add(x);
	        }
	        Collections.sort(list);
	        for(int j =0;j<list.size();j++){
	            result[i] = list.get(j);
	            i++;
	        }
	        list.clear();
	        freq.clear();
	        for(int x : result)
	        System.out.print(x+" ");
	        
	        
	    } 
	     
	     
		public static void main (String[] args)
		 {
		 //code
		 Scanner sc = new Scanner(System.in);
		 int  t = sc.nextInt();
		 while(t-->0){
		     int n= sc.nextInt();
		     int m= sc.nextInt();
		     int a [] = new int [n];
		     int b [] = new int [m];
		     for(int i =0;i<n;i++){
		         a[i]= sc.nextInt();
		     }
		     for(int i =0;i<m;i++){
		         b[i]= sc.nextInt();
		     }
		     relsort(a,b);
		 }
		 
		 
		 }
	

}
