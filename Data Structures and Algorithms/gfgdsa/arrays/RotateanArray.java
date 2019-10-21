
/*time complexity is O(d*n) 
 * if d == n then O(n^2)
 * space complexity is O(n+1) 
 * */
package gfgdsa.arrays;

public class RotateanArray {
	public static void rot(int[] arr, int low, int high, int d) {
		int temp;
		while (d > 0) {
			low = 0;
			temp = arr[low];
			while (low <= high - 1) {
				arr[low] = arr[++low];
			}
			arr[high] = temp;
			d--;
		}

		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		int d=2; //no of elements to rotate of an array anti clock wise
		int n = a.length - 1;
		rot(a, 0,n , d);
	}

}
