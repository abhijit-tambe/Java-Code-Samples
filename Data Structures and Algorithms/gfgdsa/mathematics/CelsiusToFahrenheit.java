package gfgdsa.mathematics;

import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int conv = ((t*9)/5)+32;
		System.out.println(conv);
	}

}
