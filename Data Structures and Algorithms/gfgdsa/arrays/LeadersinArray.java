/*need to find largest elements so far from end aka Leaders  in an array
 * time complexity is O(n)
 * space complexity is O(n+1)
 * */
package gfgdsa.arrays;

public class LeadersinArray {
	public static void rev(int[] arr, int low, int high) {
		int temp;
		while (low < high) {
			temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;

		}
		int bsf = 0; // biggest so far
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > bsf) {
				bsf = arr[i];
				System.out.println(arr[i]);
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 5, 3, 20, 15, 8, 3, 35, 20 };
		rev(a, 0, a.length - 1);
	}

}
