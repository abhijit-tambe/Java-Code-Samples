/*find a peak in One Dimension Array with time complexity O(log n)
 * */
package peakfinder;
import java.util.Arrays;

/**
 * @author abhijit
 *
 */
public class PeakFinderOneDR {

	private int findPeakR(int a[],int low , int high){
		int n =a.length;
		
		int mid = low + (high-low)/2;
		
		if((mid ==0 || a[mid-1]<=a[mid]) && (a[mid+1]<=a[mid] || mid == n-1 )) {
			return mid;
		}
		else if(mid>0 && a[mid-1]>a[mid]){
			return findPeakR(a,low,mid-1);
		}else
			return findPeakR(a,mid+1,high);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(find(5));
		int a[] =new int [] {9,9,3,0,6,7,2,2,0,9};
//		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		PeakFinderOneDR pk = new PeakFinderOneDR();
		int peak = pk.findPeakR(a,0,a.length-1);
		System.out.println("index " +peak +" number " +a[peak]);
	}

}
