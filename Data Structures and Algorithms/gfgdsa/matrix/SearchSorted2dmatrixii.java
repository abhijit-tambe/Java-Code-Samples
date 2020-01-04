package gfgdsa.matrix;

public class SearchSorted2dmatrixii {
	 public boolean searchMatrix(int[][] matrix, int target) {
//       if(target==0){
//           return false;
//       }
//       if(matrix.length<1){
//           return false;
//       }
//       if(matrix[0].length<1){
//           return false;
//       }
//       int initial = matrix[0].length;
      
//       // if(m[0][initial])
//       return check(matrix,target,0,initial-1);
     
      
      int m= matrix[0].length-1;
      int nmax = matrix.length-1;
      int n=0;
      while (m!=0&&n<nmax){
          if(matrix[m][n]==target){
              return true;
          }
          if(matrix[m][n]>target){
              m--;
          }else n++;
      }
      
      return false;
      
      
      
      
  }
  
  // public boolean check(int[][] m,int t, int r,int c){
  //     if(r>=m[0].length||c<0)
  //     {
  //         return false;
  //     }
  //     if(m[r][c]==t){
  //         return true;
  //     }
  //     if(m[r][c]>t){
  //         return check(m,t,r,c-1);
  //     }
  //     else{
  //         return check(m,t,r+1,c);
  //     }
  //     // if(int[r][c])
  // }
  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
