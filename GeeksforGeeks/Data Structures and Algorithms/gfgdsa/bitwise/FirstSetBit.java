package gfgdsa.bitwise;

import java.util.Scanner;

public class FirstSetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int pos=0;
		if(n==0) {
			System.out.println("0");
		}
		else {
		while(n>0&&((n&(1<<pos))==0)) {
				pos++;
		}
		System.out.println(pos+1);
		}
	}

}
