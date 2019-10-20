
/*to find if the kth bit is set or not kth is from right 
 * */
package gfgdsa.bitwise;

public class KthBitSetOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int k=4;
		int b = 1<<(k-1);
		
		if((a&b)!=0)
		System.out.println("bit is set");
		else System.out.println("bit is not set");
	}

}
