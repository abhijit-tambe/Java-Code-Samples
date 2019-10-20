package gfgdsa.mathematics;

import java.util.Scanner;

public class PrimeOrNot {
	
	
	public static boolean isPrime(int N)
    {
      //Your code here
      boolean flag = false;
      if(N>1){
         
      
      for(int i =2;i<N;i++){
          if((N%i)==0)
          {
              flag=true;
              return false;
          }
      }
      if(flag == false) return true;
      }
      //print all prime no
      //int count=0;
//      boolean a[] = new boolean[n];
//		boolean flag = true;
//		if(n>1) {
//		for (int i = 2; i <n; i++) {
//			if(i%2==0||i%3==0||i%5==0||i%7==0) {
//				a[i] =true;
//			}
//		}
//		}
//		a[0]=a[1]=true;
//		a[2]=a[3]=a[5]=a[7]=false;
//		
//		for (int i=2;i<n;i++) {
//			if(!a[i]) {
//				count++;
//				System.out.print(i+",");
//			}
//		}
      return false;
    }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int A =sc.nextInt();
		System.out.println(isPrime(A));
	}

}
