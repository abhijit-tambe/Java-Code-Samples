/*find a sub array of size k of sum present in an array with time complexity O(n)*/
package gfgdsa.arrays;

public class FindSubArrayofsizek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,7,9,63,5,20};
		int k=3;
		int sum =79;
		int cur_sum =0;
		boolean found = false;
		for(int i=0;i<k;i++) {
			cur_sum +=a[i];
		}
		if(sum==cur_sum) {
			System.out.printf("yes from index 0 to %d",k);
			found =true;
		}
		for(int j=k;j<a.length;j++) {
			cur_sum = cur_sum -a[j-k]+a[j];
			if(sum==cur_sum) {
				System.out.printf("yes from index %d to %d" ,j-k+1,j);
				found =true;
				break;
			}
		}

		if(!found) {
			System.out.println("No");
		}

	}

}
