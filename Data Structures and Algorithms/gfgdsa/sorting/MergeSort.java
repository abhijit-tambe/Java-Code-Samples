/*merge sort 
 * Time complexity O(N*log(N)) 
 * 
 * */
package gfgdsa.sorting;

import java.util.Arrays;

public class MergeSort {

	public static void mergeSort(int[] arr, int l, int r) {

		if (l < r) {
			int m = (l + r) / 2;
			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, r);
			merge(arr, l, m, r);
		}

	}

	public static void merge(int[] arr, int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;
		int a[] = new int[n1];
		int b[] = new int[n2];
		for (int i = 0; i < n1; i++) {
			a[i] = arr[l + i];
		}
		for (int i = 0; i < n2; i++) {
			b[i] = arr[m + 1 + i];
		}

		int l1 = 0, l2 = 0;
		while (l1 < n1 && l2 < n2) {
			if (a[l1] < b[l2]) {
				arr[l] = a[l1];
				l++;
				l1++;
			} else {
				arr[l] = b[l2];
				l++;
				l2++;
			}
		}
		while (l1 < n1) {
			arr[l] = a[l1];
			l++;
			l1++;
		}
		while (l2 < n2) {
			arr[l] = b[l2];
			l++;
			l2++;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 50, 10, 30, 60, 10, 80, 90 };
		mergeSort(arr, 0, arr.length - 1);
		System.out.print(Arrays.toString(arr));
	}

}
