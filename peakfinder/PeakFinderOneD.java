/* Peak finder
 * find all peaks in an array
for edges
left edge number greater than or equal to right number
right edge number greater than or equal to left number 
for rest compare the no is greater than or equal to both adjacent number
worst case time complexity Theta(n).

*/
package peakfinder;
import java.util.Arrays;

/**
 * @author abhijit
 *
 */
public class PeakFinderOneD {
	private	static int noofpeak;
	private int findPeak(int[] arr) {
		int peak =0;
//		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for(int  i=0;i<arr.length;i++) { // O(arr.length) = O(n)
			if(i==0||i==arr.length-1) {
				if(i==0 && arr[i]>=arr[i+1]) {
						peak =arr[0];
						noofpeak++;
						System.out.println("peak at left edge "+peak);
					
				}else {
					if(i== arr.length-1 && arr[arr.length-1]>=arr[arr.length-2]) {
						peak =arr[arr.length-1];
						noofpeak++;
					System.out.println("peak at right edge "+peak);
					}
				}
			}
			else {
				if(arr[i]>=arr[i-1]&&arr[i]>=arr[i+1]) {
					peak =arr[i];
					noofpeak++;
					System.out.println(peak);
				}
			}
		}
		return peak;
	}
	
	public static void main(String[] args) {
		int a[] =new int [] {8,9,3,0,6,7,2,2,0,9};
		PeakFinderOneD pk = new PeakFinderOneD();
		int peak = pk.findPeak(a);
		System.out.println("total peaks found "+noofpeak);
		System.out.println(a[peak]);
	}

}
