/*
 * Time complexity is O(n)
 * Space complexity is O(n+1)
 * */

package gfgdsa.arrays;

public class RotateanArray2 {
	public static void rot(int[] arr, int low, int high) {
		int temp;
		while (low < high) {
			temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		int d=2;//no of elements to rotate of an array anti clock wise
		rot(a, 0, d-1);
		rot(a, d, a.length-1);
		rot(a, 0, a.length-1);
		
	}

}
