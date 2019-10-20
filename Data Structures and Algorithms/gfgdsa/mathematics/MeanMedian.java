package gfgdsa.mathematics;

import java.util.Arrays;
import java.util.Scanner;

public class MeanMedian {
	
	  public static int median(int A[],int N)
	    {
	      int median=0;
	       Arrays.sort(A);
	       if(N%2==0){
	         return  (A[(N)/2]+A[((N/2)-1)])/2;
	       }
	       else median =(int)Math.floor((N-1)/2);
	       return A[median];
	       //Your code here
	       //If median is fraction then conver it to integer and return
	    }
	    
	    public static int mean(int A[],int N)
	    {
	       //Your code here
	       int sum=0;
	       for(int i=0;i<N;i++){
	           sum+=A[i];
	       }
	       return sum/N;
	       
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int t= sc.nextInt();
		while(t-->0) {
		int A =sc.nextInt();
		int Arr[] =new int [A];
		for(int i=0;i<A;i++) {
			Arr[i] = sc.nextInt();
		}
		System.out.println(mean(Arr,A));
		System.out.println(median(Arr,A));
		}
	}

}
