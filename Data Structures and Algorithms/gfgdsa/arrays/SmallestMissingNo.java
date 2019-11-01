/*
 * You are given an array arr[] of N integers including 0. The task is to find the smallest positive number missing from the array.
Note: Expected solution in O(n) time using constant extra space.

Input:
First line consists of T test cases. First line of every test case consists of N, denoting the number of elements in array. Second line of every test case consists of elements in array.

Output:
Single line output, print the smallest positive number missing.

User Task:
The task is to complete the function missingNumber() which returns the smallest positive missing number in the array.

Constraints:
1 <= T <= 100
1 <= N <= 106
-106 <= arr[i] <= 106

Example:
Input:
2
5
1 2 3 4 5
5
0 -10 1 3 -20
Output:
6
2

Explanation:
Testcase 1: Smallest positive missing number is 6.
Testcase 2: Smallest positive missing number is 2.
 * 
 * */

package gfgdsa.arrays;

import java.util.Arrays;

public class SmallestMissingNo {
	public static int miss(int arr[],int size) {
        Arrays.sort(arr);

		int index=0;        
           
		for(int i=0;i<size;i++){
		    if(arr[i]>0){
		        index =i;
		      //  one =true;
		    break;
		        
		    }
		}
		
		   
        int max =1;
        for(int i =index;i<size;i++){
            if(arr[i]>max){
                return max;
            }
            if(arr[i]==arr[i-1]){
                continue;
            }
            max++;
        }
        
        
        return max;
        

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] arr = {2,5-6,-10,-50,-2,-4,-5,1,3};	
		int [] arr ={-41, -23, 17, 6, 47, 3, 36, 15, -44, 33 ,-31, -26, -22, 21 ,-18, -21, -47, -31, 20 ,18 ,-42, -35, -10, -1 ,46 ,-27, -32, -5, -4, 1 ,-29, 5 ,29, 38, 14 ,-22, -9, 0 ,43, -50, -16, 14, -26};
		System.out.println(miss(arr,arr.length));
	}

}
