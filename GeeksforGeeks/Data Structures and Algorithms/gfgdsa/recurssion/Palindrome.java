package gfgdsa.recurssion;

public class Palindrome {
	public static boolean pali(char str[],int s,int e) {
//		int base = (str.length()/2)-1;
//		if(e<s) {
//			return false;
//		}
//		Character c =str.charAt(s);
//		Character h = str.charAt(e);
//		if(c==h) {
//			return true;
//		}
//		return pali(str,s+1,e-1);
////		else return false;
		if(e==s) {
			return true;
		}
		if(str[s]!=str[e]) {
			return false;
		}
		if(s<e)
		return pali(str,s+1,e-1);
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String str ="mal 156&*32-aya08954%$9lam ,";
	str=str.replaceAll("[^a-zA-Z]", "");
	System.out.println(str);
	System.out.println(pali(str.toCharArray(),0,str.length()-1));
//System.out.println(str.charAt(str.length()-1));
	}

}
