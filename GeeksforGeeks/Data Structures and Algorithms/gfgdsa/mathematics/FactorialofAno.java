package gfgdsa.mathematics;

import java.util.Scanner;

public class FactorialofAno {
	public static int fact(int a) {
		if(a<=1) {
			return 1;
		}
		return a*fact(a-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		System.out.println(fact(n));

	}

}
