/*
 * Given an array A[] of N positive integers. The task is to find the maximum of j - i subjected to the constraint of A[i] <= A[j].

Input:
The first line contains an integer T, depicting total number of test cases.  Then T test case follows. First line of each test case contains an integer N denoting the size of the array. Next line contains N space separated integeres denoting the elements of the array.

Output:
Print the maximum difference of the indexes i and j in a separtate line.

User Task:
The task is to complete the function maxIndexDiff() which finds and returns maximum index difference. Printing the output will be handled by driver code.

Constraints:
1 ≤ T ≤ 1000
1 ≤ N ≤ 107
0 ≤ A[i] ≤ 1018

Example:
Input:
2
2
1 10
9
34 8 10 3 2 80 30 33 1

Output:
1
6

Explanation:
Testcase 1:  In the given array A[1] < A[7] satisfying the required condition(A[i] <= A[j]) thus giving the maximum difference of j - i which is 6(7-1).
 * */

package gfgdsa.arrays;

import java.util.Arrays;

public class MaximumIndex {
	
public static int maxIndexDiff(int arr[], int n) { 
        
		// O(n^2) time complexity
		//    int diff=0;
		    
		//    for(int i=0;i<n;i++){
		//        for(int j=n-1;j>=0;j--){
		//        if(arr[i]<=arr[j]&&j-i>=diff){
		//            diff = j-i;
		//        }
		//    }  
		//    }
		// 		return diff;
	
	
	// O(n) time complexity
    if(n==1){
        return 0;
    }
    int RMax[] = new int[n]; 
    int LMin[] = new int[n]; 
    
    /* Construct LMin[] such that LMin[i] stores the minimum value 
        from (arr[0], arr[1], ... arr[i]) */
    LMin[0] = arr[0];
    for (int i = 1; i < n; ++i) 
        LMin[i] = Integer.min(arr[i], LMin[i - 1]);
    
    System.out.println(Arrays.toString(LMin));
        
    /* Construct RMax[] such that RMax[j] stores the maximum value 
        from (arr[j], arr[j+1], ..arr[n-1]) */
    RMax[n - 1] = arr[n - 1]; 
    for (int j = n - 2; j >= 0; --j)
        RMax[j] = Integer.max(arr[j], RMax[j + 1]); 
        System.out.println(Arrays.toString(RMax));
    /* Traverse both arrays from left to right to find optimum j - i 
        This process is similar to merge() of MergeSort */
    int i = 0, j = 0, maxDiff = -1; 
    while (j < n && i < n) { 
        if (LMin[i] <= RMax[j]) { 
            maxDiff = Math.max(maxDiff, j - i); 
            j++; 
        } else
            i++;
    }
    return maxDiff; 
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {34, 8 ,10, 3 ,2 ,80, 30, 33, 1};
		System.out.println(maxIndexDiff(arr,arr.length));
		
	}

}
