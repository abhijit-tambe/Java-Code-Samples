/*Hashing is very useful to keep track of the frequency of the elements in a list.

You are given an array arr[] of size n. You need to print the count of non-repeated elements in the array.

Input Format:
The first line of input contains T denoting the number of testcases. T testcases follow. Each testcase contains two lines of input. The first line contains an integer n denoting the size of the array. The second line contains n space separated elements of the array.

Output Format:
For each testcase, in a new line, print the count of distinct elements in the array.

Your Task:
This is a function problem. You only need to complete the function countNonRepeated() that takes arr and n as parameters and returns count.

Constraints:
1 <= T <= 100
1 <= n <= 103
0 <= arri <= 107

Examples:
Input:
2
10
1 1 2 2 3 3 4 5 6 7
5
10 20 30 40 10

Output:
4
3
 * */
package gfgdsa.hashing;

import java.util.HashMap;

public class CountNonRepeating {

    static long countNonRepeated(int arr[], int n)
    {
         long  r=0l;
        // add your code
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int x: arr){
            if(freq.containsKey(x)){
                int a = freq.get(x);
                freq.put(x,a+1);
            }else{
                freq.put(x,1);
            }
        }
        
        for(int x:arr){
            int temp = freq.get(x);
            if(temp==1){
                r++;
            }
        }
        
        
        // System.out.print(freq);
        return r;
    }
}