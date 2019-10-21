/*Time complexity is O(n)
 * 
 * */
package gfgdsa.arrays;

public class TrappingWater {
	public static int waterTrapped(int[] arr, int n) {
		int water = 0;
		int[] left = new int[n];
		int[] right = new int[n];
		left[0] = arr[0];
		for (int i = 1; i < n; i++) {
			left[i] = Math.max(left[i - 1], arr[i]);
		}

		right[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			right[i] = Math.max(right[i + 1], arr[i]);
		}

		for (int i = 0; i < n; i++) {
			water += Math.min(left[i], right[i]) - arr[i];
		}

		return water;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 6, 0, 1, 2, 5, 1, 2 };
		System.out.println(waterTrapped(a, a.length));

	}

}
