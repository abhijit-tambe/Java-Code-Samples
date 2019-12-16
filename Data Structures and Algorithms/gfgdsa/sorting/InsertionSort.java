/*insertion sort
 * worst case O(n^2)
 * best case O(n) if its already sorted
 * */
package gfgdsa.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void sort(int [] arr) {
		for(int i=1;i<arr.length;i++) {
			int key = arr[i];
			int j=i-1;
			
			
			while(j>=0&&arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		
		System.out.print(Arrays.toString(arr));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {50,40,30,20,10};
		sort(arr);
	}

}
