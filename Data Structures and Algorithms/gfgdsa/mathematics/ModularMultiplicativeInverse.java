/*Given two integers ‘a’ and ‘m’. The task is to find modular multiplicative inverse of ‘a’ under modulo ‘m’.

Note: Print the smallest modular multiplicative inverse.

Input Format:
First line consists of T test cases. Only line of every test case consists of 2 integers 'a' and 'm'.

Output Format:
For each testcase, in a new line, print the modular multiplicative inverse if exists else print -1.

Your Task:
This is a function problem. You just need to complete the function modInverse that takes a and m as parameters and returns modular multiplicative inverse of ‘a’ under modulo ‘m’.

Constraints:
1 <= T <= 100
1 <= m <= 100
1 <= a <= m

Example:
Input:
2
3 11
10 17

Output:
4
12

Explanation:
Testcase1:
Input:  a = 3, m = 11
Output: 4
Since (4*3) mod 11 = 1, 4 is modulo inverse of 3
One might think, 15 also as a valid output as "(15*3) mod 11" 
is also 1, but 15 is not in ring {0, 1, 2, ... 10}, so not valid.
 * */

package gfgdsa.mathematics;

import java.util.Scanner;

public class ModularMultiplicativeInverse {
	public static  int modInverse(int a, int m)
    {
        
      //Your code here
      for(int i=1;i<m;i++){
          int ans=(i*a)%m;
          if(ans==1){
              return i;
            //   break;
          }
      }
      return -1;
      
      
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0) {
			int a =sc.nextInt();
			int m =sc.nextInt();
		System.out.println(modInverse(a,m));
		}
		}

}
