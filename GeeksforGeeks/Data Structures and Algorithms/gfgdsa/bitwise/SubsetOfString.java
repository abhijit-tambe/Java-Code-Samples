package gfgdsa.bitwise;

public class SubsetOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = {"a","b","c"};
		int count = 1<<str.length;
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < str.length; j++) {
				if((i&(1<<j))!=0) {
					System.out.print(str[j]);
				}
			}
			System.out.println();
		}
		System.out.println(count);
	}

}
