package gfgdsa.recurssion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PossibleWordsFromPhoneDigits1 {

	public static void possiblewords(int []a,int N) {
		HashMap<Integer ,char[]> dic =new HashMap<Integer,char[]>();
		dic.put(2,new char[]{'a','b','c'});
		dic.put(3,new char[]{'d','e','f'});
		dic.put(4,new char[]{'g','h','i'});
	    dic.put(5,new char[]{'j','k','l'});
	    dic.put(6,new char[]{'m','n','o'});
	    dic.put(7,new char[]{'p','q','r','s'});
	    dic.put(8,new char[]{'t','u','v'});
	    dic.put(9,new char[]{'w','x','y','z'});
		
	    if(a.length==0) {
			return ;
		}
		
		List <String> list = new ArrayList<String>();
		char [] arr = new char [a.length];
		
		wordList(a,0,dic,list,arr);
		for(String s:list) {
		System.out.print(s+" ");}
	}
	
	public static void wordList(int[] a,int index, HashMap<Integer,char[]> dic,List<String> list,char[] arr) {
		if(index==a.length) {
			list.add(new String(arr));
			return;
		}
		char[] characters = dic.get(a[index]);
		for(int i=0;i<characters.length;i++) {
			arr[index] = characters[i];
			wordList(a,index+1,dic,list,arr);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] que= {5};
		possiblewords(que,que.length);

	}

}
