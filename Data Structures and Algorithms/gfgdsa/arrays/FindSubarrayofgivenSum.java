/*Given an unsorted array of non-negative integers. Find if there is a subArray with given sum time complexity O(n)
 * */
package gfgdsa.arrays;

public class FindSubarrayofgivenSum {
	public static boolean sumarray(int[] arr, int sum) {
		int cur_sum = arr[0];
		int start = 0;
		for (int i = 1; i <= arr.length; i++) {
			while (cur_sum > sum && start < i - 1) {
				cur_sum -= arr[start++];
			}
			if (cur_sum == sum) {
				return true;
			}

			if (i < arr.length) {
				cur_sum += arr[i];
			}
		}
		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 5, 7, 9, 63, 5, 20 };
		int sum = 104;
		System.out.println(sumarray(a, sum));
	}

}
