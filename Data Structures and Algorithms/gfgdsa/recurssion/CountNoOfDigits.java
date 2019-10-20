package gfgdsa.recurssion;

public class CountNoOfDigits {
	public static int count(int n) {
		if(n<=0) {
			return 0;
		}
		else
		return 1+count(n/10);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no =8898;
		System.out.println(count(no));
	}

}
