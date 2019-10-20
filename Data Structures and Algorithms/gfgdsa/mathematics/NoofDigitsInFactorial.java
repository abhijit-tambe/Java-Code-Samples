package gfgdsa.mathematics;

import java.util.Scanner;

public class NoofDigitsInFactorial {
	
	
	public static int fact(int a) {
		
		if(a<0) {
			return 0;
		}
		if(a<=1) {
			return 1 ;
		}
		double d =0;
		for(int i=2;i<=a;i++)
		{
			d +=Math.log10(i);
		}
		
		return (int) Math.floor(d)+1;
		
	}
	
//	public static long noofDigits(int no, long count) {
//		if(no<9)
//		{return 
//		++count;
//		}
//		count++;
//		return noofDigits(no/10,count);
		
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		System.out.println(Math.floor(Math.log10(n))+1);
		int factno = fact(n);
		System.out.println(factno);
//		double digit=0;
//		System.out.println(noofDigits(factno,0));
//		for(int i=1;i<factno;i++) {
//			System.out.println(Math.log10(i));
//			digit = Math.floor(Math.log10(factno))+1;
//			System.out.println((int)digit);
		}
		

	}


