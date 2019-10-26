/*
 * maximum sum of a sub array of size k using window sliding technique in O(n) time complexity
 * */

package gfgdsa.arrays;

public class MaxorMinofSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,7,9,63,5,20};
		int k=3;
		int sum =0;
		for(int i=0;i<k;i++) {
			sum +=a[i];
		}
		int sum_max =sum;
		
// below both the loops works properly 
//		for(int j=1;j<=a.length-k;j++)
//		{
//			sum = sum-a[j-1]+a[j+2];
//			sum_max =Math.max(sum_max, sum);
//			}
		
		for(int j=k;j<a.length;j++) {
			sum = sum -a[j-k]+a[j];
			sum_max =Math.max(sum_max, sum);
		}
		
		System.out.println(sum_max);
	}

}
