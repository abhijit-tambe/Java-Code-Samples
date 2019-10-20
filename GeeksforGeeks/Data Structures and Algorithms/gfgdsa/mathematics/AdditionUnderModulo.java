/*You are given two numbers a and b. You need to find the sum of a and b under modulo M.
Note: Take M as 109+7

Input Format:
The first line of input contains T denoting the number of testcases. T testcases follow. Each testcase contains one line of input containing a and b.

Output Format:
For each testcase, in a new line, print sum of a and b under modulo M.

Your Task:
This is a function problem. You need to complete the function sumUnderModulo that takes a and b as parameters and returns sum of a and b under modulo M.

Constraints:
1 <= T <= 100
1 <= a,b <= 263-1

Examples:
Input:
9223372036854775807 9223372036854775807
1000000007 1000000007
Output:
582344006
0
 * */

package gfgdsa.mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdditionUnderModulo {
	public static long sumUnderModulo(long a, long b)
    {
        int M=1000000007;
        // Your code here, return sum of a and b
        
        long sum = ((a%M)+(b%M))%M;
//        long sum = (a+b)%M;
        return sum;
    }   
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0) {
            String[] str = read.readLine().trim().split(" ");
            Long a = Long.parseLong(str[0]);
            Long b = Long.parseLong(str[1]);
            
            System.out.println(new AdditionUnderModulo().sumUnderModulo(a,b));
        }
    }

}
