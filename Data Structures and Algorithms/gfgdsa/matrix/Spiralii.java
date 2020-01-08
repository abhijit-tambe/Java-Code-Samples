package gfgdsa.matrix;

public class Spiralii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		public int[][] generateMatrix(int n) {
		int n=10;
	        int a [][] = new int [n][n];
	        int c =1;
//	        while(c!=(n*n)+1) {
	        for(int m=0;m<(n+1)/2;m++){
	        for(int i=m;i<n-m;i++){
	            System.out.print((a[m][i]=c++)+" ");
	        }
	        System.out.println();
	        for(int j=m+1;j<n-m;j++){
	            System.out.print((a[j][n-1-m]=c++)+" ");
	        }
	        System.out.println();
	        for(int k=n-2-m;k>=m;k--){
	            System.out.print((a[n-1-m][k]=c++)+" ");
	        }
	            System.out.println();
	        for(int l= n-2-m;l>=m+1;l--){
	            System.out.print((a[l][m]=c++)+" ");
	        }    
	            System.out.println();
	            
	        }
//	        return a;
	        	
	        int abc[][] = {{},{}};
	        System.out.println(abc.length);
	        
	        
	}

}
