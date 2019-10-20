package gfgdsa.mathematics;

public class GcdLcm {
	//euclide subtract method
public static int Gcd(int a, int b) {
	if(a==b)
		return a;
	if(a>b)
		return Gcd(a-b,b);
	return Gcd(a,b-a);
}

public static int Gcd2(int a,int b) {
	if(a==0)return b;
	return Gcd2(b%a,a);
}

public static int lcm(int a,int b) {
	int gcd = Gcd2(a,b);
	int lcm = (a*b)/gcd;
	return lcm;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =2 ;int b =7;
		System.out.println(Gcd2(a,b));
		System.out.println(lcm(a,b));
	}

}
