/*Insertion Sort with worst case theta(n^2) and best case theta(n)
 * loop till a key is selected from first index of an array till it's length,
 * the key compared with number in previous index which is j
 * if the key is smaller than the number, insert the number in (j+1)th index i.e number's
 *  next index, decrement j by one. perform till while condition meets 
 * insert the key in (j+1)th index which will be the last compared number position  
 * */
package insertionsort;
import java.util.Arrays;

/**
 * @author abhijit
 *
 */
public class InsertionSort {

	private static int[] insertSort(int a[]) {
		for (int i = 1; i < a.length; i++) {
			int key = a[i];
			int j = i - 1;
			while (j >= 0 && key < a[j]) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sample[] = { 100, 8, 5, 6, 4, 5, 4, 6, 4, 6, 3, 23, 1, 2, 4 };

		int ab[] = insertSort(sample);
		System.out.println(Arrays.toString(ab));
	}

}
