/*
 * Separate chaining technique in hashing allows to us to use a linked list at each hash slot to handle the problem of collisions. That is, every slot of the hash table is a linked list, so whenever a collision occurs, the element can be appened as a node to the linked list at the slot.

In this question, we'll learn how to fill up the hash table using Separate chaining technique. You are given hash table size which you'll use to insert elements into their correct position in the hash table. You are also given an array arr. The size of the array is denoted by sizeOfArray. You need to fill up the hash table using Separate chaining and print the resultant hash table.

Input Format:
The first line of input contains T denoting the number of testcases. T testcases follow. Each testcase contains 3 lines of input. The first line contains size of the hashtable. The second line contains size of the array. The third line contains elements of the array.

Output Format:
For each testcase, in a new line, print the hash table.

Your Task:
This is a function problem. You need to complete the function separateChaining that takes hashTable, hashSize, arr, and sizeOfArr as parameters and inserts elements of arr in the hashTable at positions by using arr[i]%hashSize. The printing is done automatically by the driver code.

Constraints:
1 <= T <= 100
2 <= hashSize <= 103
1 <= sizeOfArray <= 103
0 <= arri <= 107

Examples:
Input:
1
10
6
92 4 14 24 44 91
Output:
1->91
2->92
4->4->14->24->44

Explanation:
Testcase1: 92%10=2 so 92 goes to slot 2. 4%10=4 so 4 goes to slot 4. 14%10=4. But 4 is already occupied so we make a linked list at this position and add 14 after 4 in slot 4 and so on.
 * 
 * */


package gfgdsa.hashing;

import java.util.ArrayList;
import java.util.Arrays;

public class SeparateChaining {

	static void separateChaining(int arr[], int n, ArrayList<ArrayList<Integer>> hashTable, int hashSize)
	{
	    //Your code here
	        for(int j=0;j<hashSize;j++){
	        	ArrayList <Integer> innerlist =new ArrayList<Integer>();
	        		hashTable.add(j,innerlist);
	        }
	        
	        StringBuilder sb = new StringBuilder();
	        
	        sb.append(1);
	        for(int i=0;i<n;i++) {
	        	int h = arr[i]%hashSize;

	        		ArrayList <Integer> l = hashTable.get(h);
	        		l.add(arr[i]);

	        }
	        
	        for(int m =0;m<hashSize;m++) {
	        	ArrayList <Integer> l = hashTable.get(m);
	        	if(!l.isEmpty()) {
	        		int s = l.size();
	        		System.out.print(m+"->");
	        		for(int x=0;x<s-1;x++) {
	        			System.out.print(l.get(x)+"->");
	        		}
	        		System.out.println(l.get(s-1));	
	        	}
	        }
	        

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hashsize =10;
		int arr [] = {92, 4, 14, 24, 44, 91};
	
		ArrayList<ArrayList<Integer>> h = new ArrayList<>(hashsize);
		separateChaining(arr,arr.length,h,hashsize);
	}

}
