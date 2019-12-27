/*
 * Print Matrix in snake Pattern
 * 
 * Given a matrix mat[][] of size N x N. The task is to print the elements of the matrix in the snake pattern.


Input Format:
First line consists of an integer T denoting the number of test cases. First line of each test case consists of N, denoting number of elements(N x N) in Matrix. Second line of every test case consists of N x N spaced integers denoting elements of Matrix elements.

Output Format:
For each testcase, in a new line, print the matrix in snake pattern.

Your Task:
This is a function problem. You only need to complete the function print that takes a matrix and n as parameters and prints the matrix. The newline is automatically appended by the driver code.

Constraints:
1 <= T <= 100
1 <= N <= 100
1 <= mat[i][j] <= 100

Example:
Input:
2
3
45 48 54 21 89 87 70 78 15
2
1 2 3 4

Output:
45 48 54 87 89 21 70 78 15 
1 2 4 3

Explanation:
Testcase 1: Matrix is as below:
45 48 54
21 89 87
70 78 15

Printing it in snake pattern will lead to the output as 45 48 54 87 89 21 70 78 15.
 * */
package gfgdsa.matrix;

public class SnakePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][]= {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
	
			for(int i=0;i<arr.length;i++) {
				if(i%2==0) {
					for(int j=0;j<arr[i].length;j++) {
						System.out.print(arr[i][j]+" ");
					}
				}else {
					for(int j=arr[i].length-1;j>=0;j--) {
						System.out.print(arr[i][j]+" ");
					}
				}
			}
	
	}
	

}
