package gfgdsa.recurssion;

public class SumOFDigits {

	public static int sum(int n) {
		if(n<10) {
			return n;
		}
		else 
			return n%10+sum(n/10);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = sum(9987);
		System.out.println(a);
	}

}
