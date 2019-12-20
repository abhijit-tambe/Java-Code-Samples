/*Mother vertex
 * Find the Mother vertex in a directed graph. A mother vertex in a graph G = (V,E) is a vertex v such that all other vertices in G can be reached by a path from v.

Input:
The first line of input contains an integer T. Then T test cases follow. Each test case contains two integers N and M. In the next line are M space separated values u,v denoting an edge from u to v.

Output: For each testcase return the mother vertex of graph (if existes) else return -1.

Note: This is a functional probem. Complete function findmother().

Constraints:
1 <= T <= 100
1 <= N, M <= 104
0 <= u, v < N

Example:
Input:
2
5 5
1 0 0 2 2 1 0 3 3 4
3 2
0 1 2 1

Ouput:
0
-1

Explanation:
Testcase 1: According to the given edges, all nodes can be reaced from nodes from 0, 1 and 2. But, since we are traversing from node 0, so 0 is the output.

Testcase 2: According to the given edges, no vertices are there from where we can reach all vertices. So, output is -1.
 * */
package gfgdsa.graphs;

import java.util.ArrayList;

public class MotherVertex {
	
	    static int findMother(ArrayList<ArrayList<Integer>> list, int n)
	    {
	        // add your code here

	        boolean vis[]; 
	       
	        for(int i=0;i<n;i++){
	                if(dfs(i,list,new boolean [n])){
	                    return i;
	            }
	        }
	        return -1;
	    }
	    
	    
	    
	    static boolean dfs(int s,ArrayList<ArrayList<Integer>> list,boolean []vis){
	        
	        vis[s]=true;
	        for(int x : list.get(s)){
	            if(!vis[x]){
	               if(dfs(x,list,vis)) {
	                   return true;
	              }
	                    
	            }
	        }
	    
	         for(boolean b :vis){
	         if(!b){
	             return false;
	         }   
	        }
	        
	        return true;
	    } 
	    
	
}
