/*Given a sorted array of positive integers. Your task is to rearrange  the array elements alternatively i.e first element should be max value, second should be min value, third should be second max, fourth should be second min and so on...

Note: O(1) extra space is allowed. Also, try to modify the input array as required.

Input:
First line of input conatins number of test cases T. First line of test case contain an integer denoting the array size N and second line of test case contain N space separated integers denoting the array elements.

Output:
Output the modified array with alternated elements.

Constraints:
1 <=T<= 100
1 <=N<= 107
1 <=arr[i]<= 107

Example:
Input:
2
6
1 2 3 4 5 6
11 
10 20 30 40 50 60 70 80 90 100 110

Output:
6 1 5 2 4 3
110 10 100 20 90 30 80 40 70 50 60

Explanation:
Testcase 1: Max element = 6, min = 1, second max = 5, second min = 2, and so on... Modified array is : 6 1 5 2 4 3.
 * */



package gfgps.arrays;

import java.util.Scanner;

public class RearrangeArrayAlternately {
	
	public static void rearrange(int[] a) {
		int l =a.length;
		int start=0;
		int end = l-1;
		
		//O(n^2) complexity and no extra space needed 
//		for(int j=0;j<l;j+=2) {
//		int last = a[end];
//		for(int i=end;i>j;i--) {
//		a[i]=a[i-1];
//		}
//		a[j]= last;
//		}
		//
		
		
		// efficient time complexity O(n)
		int b[] = new int[l];
		for(int i=0;i<a.length;i+=2) {
			b[i] = a[--l];
//			l-=2;
		}
		int k=0;
		for(int i=1;i<a.length;i+=2) {
			
			b[i] = a[k];
//			l-=2;
			k++;
		}
		
		for(int j=0;j<b.length;j++) {
			System.out.println(b[j]);
		}
		
//		for(int i=0;i<a.length;i++) {
//			if(i==a.length-1)
//			System.out.print(a[i]);
//		else
//			System.out.print(a[i]+" ");
//		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
//			int s = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			rearrange(arr);
		}
	}

}
