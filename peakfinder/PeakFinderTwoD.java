/*find a peak  in  2D array with worst time complexity theta(n log n)
*/

/**
 * @author abhijit
 *
 */
public class PeakFinderTwoD {
	private static int globalMax;

	private int peakFinder(int[][] a, int col) {
		globalMax = findGlobalMax(a, col);
		if ((col == 0) || (col == a.length - 1) || (a[col][globalMax] >= a[col - 1][globalMax]
				&& a[col][globalMax] >= a[col + 1][globalMax])) {
			return a[col][globalMax];
		} else if (a[col][globalMax] < a[col - 1][globalMax]) {

			return peakFinder(a, col - 1);
		} else {

			return peakFinder(a, col + 1);
		}
	}

	private int findGlobalMax(int[][] a, int col) {
		int innermax = 0;
		int innermaxindex = 0;
		for (int j = 0; j < a[col].length; j++) {
			if (a[col][j] >= innermax) {
				innermax = a[col][j];
				innermaxindex = j;
			}
		}
		System.out.println("a[" + col + "] [" + innermaxindex + "] = " + a[col][innermaxindex]);
		return innermaxindex;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr[] = { { 4, 1, 5, 12, 9 }, { 5, 4, 7, 9, 3 }, { 9, 15, 6, 9, 6 }, { 6, 21, 5, 15, 9 },
				{ 2, 0, 1, 20, 4 } };	
		int col = arr.length / 2;
		PeakFinderTwoD pk = new PeakFinderTwoD();
		int peak = 0;
		peak = pk.peakFinder(arr, col);
		System.out.println("peak " + peak);

	}

}
