/**this program finds dot and cross products of two vectors
 * 
 */
package productvectors;

import java.util.Arrays;

/**
 * @author abhijit
 *
 */

public class ProductOfVectors {

	private int dotProduct(int[] a, int[] b) {
		int dotprod = 0;

		for (int i = 0; i < 3; i++) {
			dotprod += a[i] * b[i];
		}
		return dotprod;
	}

	private int[] crossProduct(int[] a, int[] b) {
		int crossprod[] = new int[3];
		crossprod[0] = (a[1] * b[2] - a[2] * b[1]);
		crossprod[1] = (a[0] * b[2] - a[2] * b[0]);
		crossprod[2] = (a[0] * b[1] - a[1] * b[0]);
		return crossprod;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Vector_one[] = { 90, -16, 74 };
		int Vector_two[] = { -50, 67, 35 };
		ProductOfVectors pv = new ProductOfVectors();
		System.out.println(
				"Vector one : " + Arrays.toString(Vector_one) + ", Vector two : " + Arrays.toString(Vector_two));
		System.out.println("cross product is : " + Arrays.toString(pv.crossProduct(Vector_one, Vector_two)));
		System.out.println("dot product is : " + pv.dotProduct(Vector_one, Vector_two));

	}

}
