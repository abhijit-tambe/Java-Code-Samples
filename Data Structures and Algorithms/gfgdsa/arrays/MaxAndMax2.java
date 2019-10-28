/*Given an array arr[] of size N of positive integers which may have duplicates. The task is to find maximum and second maximum from the array, which must be distinct. If no second max exists, then second max will be -1.

Input Format:
First line of input contains number of testcases T. For each testcase, first line of input contains size of array N, next line contains array elements.

Output Format:
For each testcase, print the maximum and second maximum from the array. IF no second max exists, print "-1" for second max.

Constraints:
1 <= T <= 100
1 <= N <= 106
1 <= arr[i] <= 106

User Task:
The task is to complete the function largestAndSecondLargest(), which should print maximum and second maximum element from the array.

Example:
Input:
2
5
1 2 3 4 5
3
2 1 2

Output:
5 4
2 1

Explanation:
Testcase 1: From the given array elements, 5 is the largest and 4 is the second largest.
Testcase 2: From the given array elements, 2 is the largest and 1 is the second largest.
 * 
 * */

package gfgdsa.arrays;

public class MaxAndMax2 {

	public static void maxMax2(int sizeOfArray,int arr[]) {
		
		int max = Integer.MIN_VALUE;
        int max2 = -1;
        
		   for(int i=0;i<sizeOfArray;i++){
	            max = Math.max(arr[i],max);
	        }
	        for(int i=0;i<sizeOfArray;i++){
	           
	            if(arr[i]>max2&&arr[i]!=max){
	                max2=arr[i];
	            }
	        }
	        
	        
	        System.out.println(max + " " + max2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr []= {10,5,4,3,5,700,6,4,659,2,56,4,9};
//		int arr[] = {10,10,10};
		maxMax2(arr.length,arr);
	}

}
