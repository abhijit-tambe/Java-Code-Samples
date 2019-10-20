package gfgdsa.recurssion;

public class AllSubSetofAString {

	public static void sub(String str, int index, String curr) {
		if (index == str.length()) {
			System.out.println(curr);
			return;
		}
		sub(str, index + 1, curr + str.charAt(index));
		sub(str, index + 1, curr);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abc";
		int index = 0;
		String curr = "";
		sub(a, index, curr);
	}
}
