/**this program finds total no of characters in a String finds the smallest and greatest character , their 
 *first and last occurrence index and  their frequencies 
 */
package characterfrequency;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 * @author abhijit
 *
 */
public class CharacterFrequency {

	/**
	 * @param args
	 */
	private static int firstsmallestCindex, firstgreatestCindex, lastsmallestCindex, lastgreatestCindex;
	private static char small, great;

	private void Dictionary(Hashtable<Character, Integer> ht, char ch1[]) {
		char key;
		for (char i : ch1) {
			int count = 0;
			if (ht.containsKey(i)) {
				count = ht.get(i);
				ht.put(i, ++count);
			} else
				ht.put(i, 1);
		}
		Enumeration<Character> characters = ht.keys();
		while (characters.hasMoreElements()) {
			key = characters.nextElement();
//			System.out.println(key + " : " + ht.get(key));
		}
	}

	private void findindex(char ch1[]) {
		great = ch1[0];
		small = ch1[0];
		for (char i : ch1) {
			if (i <= small) {
				small = i;
			}
			if (i >= great) {
				great = i;
			}
		}

		for (int i = 1; i <= ch1.length; i++) {
			Character temp = small;
			if (temp.equals(ch1[i - 1]) && firstsmallestCindex == 0) {

				firstsmallestCindex = i;
				lastsmallestCindex = i;
			} else if (temp.equals(ch1[i - 1])) {
				lastsmallestCindex = i;
			}
			temp = great;
			if (temp.equals(ch1[i - 1]) && firstgreatestCindex == 0) {
				firstgreatestCindex = i;
				lastgreatestCindex = i;
			} else if (temp.equals(ch1[i - 1])) {
				lastgreatestCindex = i;
			}

		}
		firstsmallestCindex--;
		firstgreatestCindex--;
		lastsmallestCindex--;
		lastgreatestCindex--;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "  d ~1wlidqqdqwcqojioj9inlkmnmcmb dsadaaaaaaxaaaaaaaadO dasdasdasd asdasdasdasda~~opjdiasjda sdkx~f ";
		char[] ch1 = s.toCharArray();
//		System.out.println(Arrays.toString(ch1));
		Hashtable<Character, Integer> ht = new Hashtable<Character, Integer>();

		CharacterFrequency cs = new CharacterFrequency();
		cs.findindex(ch1);
		cs.Dictionary(ht, ch1);

		System.out.println("total no of Characters :" + ch1.length);
		System.out.println("smallest character is : '" + small + "' , frequency is :" + ht.get(small)
				+ ", first occurrence at index :" + firstsmallestCindex + ", last occurrence at index :"
				+ lastsmallestCindex);
		System.out.println("greatest character is : '" + great + "' , frequency is :" + ht.get(great)
				+ ", first occurrence at index :" + firstgreatestCindex + ", last occurrence at index :"
				+ lastgreatestCindex);
	}
}
