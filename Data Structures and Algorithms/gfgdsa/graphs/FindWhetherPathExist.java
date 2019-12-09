/*Given a N X N matrix (M) filled with 1, 0, 2, 3. The task is to find whether there is a path possible from source to destination, while traversing through blank cells only. You can traverse up, down, right and left.

A value of cell 1 means Source.
A value of cell 2 means Destination.
A value of cell 3 means Blank cell.
A value of cell 0 means Blank Wall.
Note: there is only single source and single destination.

 

Input:
The first line of input is an integer T denoting the no of testcases. Then T test cases follow. Each test case consists of 2 lines. The first line of each test case contains an integer N denoting the size of the square matrix. Then in the next line are N*N space separated values of the matrix (M).

Output:
For each test case in a new line print 1 if the path exist from source to destination else print 0.

Constraints:
1 <= T <= 20
1 <= N <= 20

Example:
Input:
2
4
3 0 0 0 0 3 3 0 0 1 0 3 0 2 3 3 
3
0 3 2 3 0 0 1 0 0

Output:
1
0

Explanation:
Testcase 1: The matrix for the above given input is:
3 0 0 0
0 3 3 0
0 1 0 3
0 2 3 3
From the matrix we can see that there exists a path from to reach destination 2 from source 1.
Testcase 2: The matrix for the above given input is:
0 3 2
3 0 0
1 0 0
From the matrix we can see that there does not exists any path to reach destination 2 from source 1.
 * */package gfgdsa.graphs;

import java.util.Scanner;

public class FindWhetherPathExist {

	public static void main (String[] args)
	 {
	 //code
	 Scanner sc = new Scanner(System.in);
	 int t = sc.nextInt();
	 while(t-->0){
	     int n = sc.nextInt();
	        int [][] arr = new int [n][n];
	        for(int i=0;i<n;i++){
	            for(int j =0;j<n;j++){
	                arr[i][j] = sc.nextInt();
	            }
	        }
	        
	        System.out.println(path(arr,n));
	 }
	 
	 
	 }
	 
	 static int path(int [][] arr, int n){
	    boolean [] flag = new boolean [1] ; 
	    boolean vis [][]=new boolean [n][n];
	    flag[0] =false;
	    for(int i=0;i<n;i++){
	            for(int j =0;j<n;j++){
	                if(!vis[i][j]&&arr[i][j]==1){
	                    dfs(i,j,arr,vis,n, flag);
	                    if(flag[0]){
	                        return 1;
	                    }
	                    else return 0;
	                }
	            }
	        }  
	        
	     return 0;
	 }
	 
	 static void dfs(int i , int j ,int [][]arr,boolean[][]vis,int n,boolean[] flag){
	     if(flag[0]){
	         return;
	     }
	     
	     if(i<0||i>n-1||j<0||j>n-1){
	         return ; 
	     }
	     
	     if(vis[i][j]){
	         return ;
	     }
	     
	     vis[i][j] = true;
	     
	     if(arr[i][j]==0){
	         return ;
	     }
	     
	     if(arr[i][j]==2){
	         flag[0] =true;
	         return ;
	     }
	     
	     dfs(i-1,j,arr,vis,n,flag);
	     dfs(i+1,j,arr,vis,n,flag);
	     dfs(i,j-1,arr,vis,n,flag);
	     dfs(i,j+1,arr,vis,n,flag);
	 }
	 
	 
	 
	 
	 
	 
}