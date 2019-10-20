package gfgdsa.recurssion;

public class PossibleWordsFromPhoneDigits2 {
	/**
	 * @author abhijit
	 *
	 */

	static String key[] = {"","", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

	static void possibleWords(int a[], int N)
	{
	// your code here
	int l = 0,seq = 0;
	String curr = "";
	wordsutil(a, N, l, seq, curr);

	}

	static void wordsutil(int a[], int N, int index,int seq, String curr){
	if(N == index){
	System.out.print(curr + " ");
	return;
	}
	else{
	for(int i = 0; i < key[a[index]].length(); i++){
	wordsutil(a,N,index+1,seq,curr+key[a[index]].charAt(seq+i));
	}
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {0,3};
		possibleWords(a,a.length);
	}

}
