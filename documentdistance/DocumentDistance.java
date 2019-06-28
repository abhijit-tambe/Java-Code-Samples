/** document distance is the angle which shows the similarity between the two documents.
 *1. get rid of punctuation. 
 *2. convert everything to lower case split into arrays of words for both the document.
 *3. make a dictionary  and keep the frequency of the words i.e the vector data.
 *4. find the dot product of both vectors divide them by square root of product of length of both vectors.  
 *5. take arccos of the value to get the angle which is in radians convert to degree. 
 *6. 0 degree means both the document are identical , 90 degree means both the documents don't share any words. 
 */
package documentdistance;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 * @author abhijit
 *
 */
public class DocumentDistance {

	/**
	 * @param args
	 */

	private int innerProduct(Hashtable<String, Integer> ht1, Hashtable<String, Integer> ht2) {
		int prod = 0;
		String key;
		Enumeration<String> e = ht1.keys();
		while (e.hasMoreElements()) {
			key = e.nextElement();
			if (ht2.containsKey(key)) {
				prod += (ht2.get(key) * ht1.get(key));
			}
		}
		return prod;
	}

	private Hashtable<String, Integer> wordDictionary(String[] D1, Hashtable<String, Integer> ht) {
		for (String s3 : D1) {
			int count = 0;
			if (ht.containsKey(s3)) {
				count = ht.get(s3);
				ht.put(s3, ++count);
			} else
				ht.put(s3, ++count);
		}
		return ht;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = " cat$ is  mad the.mad-on<is mcat dqasdaskdm asda sda dmasmdla mdlk dasio dasoij diadjas daisj doiaj doaijd a"
				+ "d asd has daod aodiasdoiaj oj das" + " dasijd ai jia jdai jdad a as" + " asi asio jaisjdaso d"
				+ "d asidj asidjadjapdajsdaspo daopdapdjoieie jajdklasdj aoidj asid asdj asasl";

		String s2 = "hello man how dasdasjdiasjdasjdaijdasd" + "dasidjasiodjasidajsdiasdoasdo"
				+ "adjaiosjdasdjasdasodkasodk   adokosakdpoakdaos doasjdajdasjdasidj" + " djasiodjasjdasdj"
				+ " dasdjajdasdpadasp" + "d asd" + "asdspodjsdjsajdsodjosjdosdji"
				+ "djsaijdasjdasoidajsiodajsdjaodjoados the";
		s1 =s2;
		String D1[] = s1.replaceAll("[^a-zA-Z ]", " ").toLowerCase().split("\\s+");
		String D2[] = s2.replaceAll("[^a-zA-Z ]", " ").toLowerCase().split("\\s+");

		Hashtable<String, Integer> ht1 = new Hashtable<>();
		Hashtable<String, Integer> ht2 = new Hashtable<>();

		DocumentDistance documentD = new DocumentDistance();
		ht1 = documentD.wordDictionary(D1, ht1);
		ht2 = documentD.wordDictionary(D2, ht2);

		int numerator = documentD.innerProduct(ht1, ht2);
		double denominator = Math.sqrt((documentD.innerProduct(ht1, ht1) * documentD.innerProduct(ht2, ht2)));
		double rad = Math.acos(numerator / denominator);
		double deg = Math.toDegrees(rad);
		System.out.println("angle between two document vectors in radians " + rad);
		System.out.printf("%.2f Degree \n", deg);
		System.out.println("Reference : 0 Degree is total same documents, 90 Degree total different documents");
	}
}