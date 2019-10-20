package gfgdsa.mathematics;

import java.util.Scanner;

public class QuadraticEquationRoots {

	public static void findroots(int a, int b ,int c ) {
//		int root1 ,root2;
//        int b1 = (int)(Math.pow(b,2));
//        int ac = 4*a*c;
//        if(b1 <ac){
//            System.out.println("imaginary");
//        }
//        else{
//        root1 = (int)(((-1*b)+Math.pow((b1-ac),0.5))/(2*a));
//        root2 = (int)(((-1*b)-Math.pow((b1-ac),0.5))/(2*a));
//        System.out.println(root1+" "+root2);
//        }
	
		double root1 ,root2;
        double b1 = (Math.pow(b,2));
        System.out.print("b1"+b1);
        int ac = 4*a*c;
        System.out.print("ac");
        int b11 = -1*b;
        double secondt = Math.pow((b1-ac),0.5);
        System.out.println(secondt);
        int a1 =2*a;
        if(b1>=ac){
        root1 = Math.floor(((b11+secondt)/a1));
        root2 = Math.floor(((b11-secondt)/a1));
        
        System.out.print((int)root1+" "+(int)root2);
            
        }
        else System.out.print("Imaginary");

		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t-->0) {
			int a = sc.nextInt();
			int b = sc.nextInt();int c = sc.nextInt();
			findroots(a,b,c);
		}
		
		}

}
