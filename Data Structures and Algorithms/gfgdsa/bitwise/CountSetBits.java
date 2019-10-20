package gfgdsa.bitwise;

import java.util.Scanner;

public class CountSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				int n= sc.nextInt();
				int count=0;
				while(n>0) {
					n=n&(n-1);
					count++;
				}
				System.out.println(count);
	}

}
