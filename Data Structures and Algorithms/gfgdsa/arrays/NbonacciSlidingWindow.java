/* N-bonacci Number print first m N-bonacci Number
 * 0 1 1 2 3 5 8 13 21 34 fibonacci
 * 0 0 1 1 2 4 7 13 24 44 N-bonacci where n =3
 * */
package gfgdsa.arrays;

import java.util.Arrays;

public class NbonacciSlidingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 10;
		int n=3;
		int arr[] = new int [m];
		for(int i=0;i<n;i++) {
			arr[i] =0;
		}
		arr[n-1] =1;
		arr[n] =1;
		// Time complexity O(nxm)
//		for(int i=n+1;i<m;i++) {
//			int cur_sum=0;
//			int j=1;
//			while (j!=n+1) {
//				cur_sum += arr[i-j];
//				j++;
//			}
//			arr[i] = cur_sum;
//		}		
		
		// Time complexity O(n)
		for(int i= n+1;i<m;i++) {
			arr[i] =2* arr[i-1] - arr[i-n-1];
		}
		System.out.println(Arrays.toString(arr));
	}

}
