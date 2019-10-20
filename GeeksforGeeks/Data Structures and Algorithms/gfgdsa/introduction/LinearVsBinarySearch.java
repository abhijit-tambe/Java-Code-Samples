package gfgdsa.introduction;

import java.util.Scanner;

public class LinearVsBinarySearch {
	public static int linearSearch(int[] arr, int x) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				return i;
			}
		}
		return -1;
	}

	public static int binarySearch(int[] arr, int start, int end, int x) {
		if (end >= start) {
			
			int mid = start + (end - start) / 2;
			
			if (arr[mid] == x) {
				return mid;
			}
			
			if (arr[mid] > x) {
				return binarySearch(arr, start, mid - 1, x);
			}

			return binarySearch(arr, mid + 1, end, x);

		}

		return -1;
	}

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int e = sc.nextInt();
		int found;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = i;
		}
		System.out.println(linearSearch(arr,n-1));
//		found = binarySearch(arr, 0, n - 1, n-1);
		System.out.println(binarySearch(arr, 0, n - 1, n-1));
		
		
//		if (found == -1) {
//			System.out.println("element not found");
//		}
//
//		System.out.println(found);
	}

}
