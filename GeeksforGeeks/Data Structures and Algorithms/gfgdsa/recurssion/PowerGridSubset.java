/*You are given a string s. You need to print the lexicographically sorted power-set of the string.
Note: The string s contains lowercase letter of alphabet.

Input Format:
The first line of input contains T, denoting the number of testcases. T testcases follow. Each testcases contains one line of input containing string s.

Output Format:
For each testcase, in a new line, print the lexicographically sorted sub-sets of the powerset of s. Each subset is separated by a space.

Your Task:
This is a function problem. You only need to complete the function powerSet that takes string s as parameter and returns a vector/ArrayList of subsets. The lexicographic-sorting and printing is done automatically by the driver code.

Constraints:
1 <= T <= 100
1 <= |s| <= 10

Examples:
Input:
2
a
abc
Output:
 a
 a ab abc ac b bc c

Explanation:
Testcase1: space and a are only sets.
Testcase2: space,  a, ab, abc, ac, b, bc, c are the sets.
 * */

package gfgdsa.recurssion;
import java.util.ArrayList;
import java.util.Collections;

public class PowerGridSubset {
public static void powerGrid(String str,int x , String cur,ArrayList<String>str1) {
//	int counter=0;
	if(x==str.length()) {
//		System.out.print(cur);
		str1.add(cur);
//		System.out.println(str1);
		return ;
	}
	powerGrid(str,x+1,cur,str1);
	powerGrid(str,x+1,cur+str.charAt(x),str1);
}
public static ArrayList<String> PowerGridList(String str,ArrayList<String>str1)
{		powerGrid(str,0,"",str1);
		Collections.sort(str1);
		return str1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="abcd";
		ArrayList<String> str1 = new ArrayList<String>();
		str1 = PowerGridList(str,str1);
		for(String s:str1)
		System.out.print(s+" ");
	}

}
