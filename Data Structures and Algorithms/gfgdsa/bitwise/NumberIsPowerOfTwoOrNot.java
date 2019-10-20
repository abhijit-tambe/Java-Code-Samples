package gfgdsa.bitwise;

import java.util.Scanner;

public class NumberIsPowerOfTwoOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		if((n>0)&&((n&(n-1))==0)) {
			System.out.println("Number is power of 2");
		}
		else 
			System.out.println("Number is not a power of 2");
	}

}
