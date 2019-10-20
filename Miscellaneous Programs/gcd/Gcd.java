//package commonDenominator;

import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class Gcd {
	
	
	public static void  gcd(int x, int y) {
		int n ;
//		LocalTime t = LocalTime.now();
		
		Date s = new Date();
		long s1 ,e1;
//		d.getSeconds();
		s1 =s.getTime();
//		System.out.println(t.getSecond());
//		 (x<y)? n=x:n=y;
		int gcd =0 ;
		if(x<y) {
			n=y;
			}else {
				n=x;
				}
		System.out.println("executing!!!");
		for(int z=1;z<n;z++) {
		if(x%z==0&&y%z==0) {
//			System.out.println(z);
			gcd =z;
		}
		}
		Date e = new Date();
		e1 = e.getTime();
//		String power = Integer.toString(gcd, 2);
		System.out.printf("gcd of two numbers %d and %d is : %d" ,x,y,gcd);
		System.out.println("\ntime taken : " +(e1-s1) +" milliseconds");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter 1st number and its exponent");
		
 		int num1 = input.nextInt();

		 int num2 = input.nextInt();

		System.out.println("enter 2nd number and its exponent");
		
 		int num3 = input.nextInt();
		 int num4 = input.nextInt();
		int a=(int)Math.pow(num1, num2),b=(int)Math.pow(num3, num4);
		gcd(a,b);

	}

}
