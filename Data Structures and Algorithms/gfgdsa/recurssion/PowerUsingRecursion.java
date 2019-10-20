package gfgdsa.recurssion;

public class PowerUsingRecursion {
public static int power(int x, int n) {
	if(n<1) {
		return 1;
	}
	return x*power(x,n-1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =9;
		int n=9;
		System.out.println(power(x,n));

	}

}
