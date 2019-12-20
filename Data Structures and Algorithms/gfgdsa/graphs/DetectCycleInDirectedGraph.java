/*Detect cycle in a directed graph
 * 
 * Given a directed graph, the task is to complete the method isCyclic() to detect if there is a cycle in the graph or not. You should not read any input from stdin/console. There are multiple test cases. For each test case, this method will be called individually.

Input: The first line of the input contains an integer 'T' denoting the number of test cases. Then 'T' test cases follow. Each test case consists of two lines. Description of testcases is as follows: The First line of each test case contains two integers 'N' and 'M'  which denotes the no of vertices and no of edges respectively. The Second line of each test case contains 'M'  space separated pairs u and v denoting that there is an uni-directed  edge from u to v .

Output:
The method should return 1 if there is a cycle else it should return 0.

User task:
Since this is a functional program you don't have to worry about input, you just have to complete the function

Constraints:
1 <= T <= 100
1<= N,M <= 100
0 <= u,v <= N-1

Example:
Input:
3
2 2
0 1 0 0
4 3
0 1 1 2 2 3
4 3
0 1 2 3 3 2
Output:
1
0
1

Explanation:
Testcase 1: In the above graph there are 2 vertices. The edges are as such among the vertices.


From graph it is clear that it contains cycle.
 * 
 * */
package gfgdsa.graphs;

import java.util.ArrayList;

public class DetectCycleInDirectedGraph {

	    static boolean isCyclic(ArrayList<ArrayList<Integer>> list, int V)
	    {
	        // add your code here
	        boolean vis[]= new boolean [V];
	        boolean anc[]= new boolean [V];
	        
	        for(int i=0;i<V;i++){
	            if(!vis[i]){
	                // anc = new boolean[V];
	                if(dfs(i,list,vis,anc)){
	                    return true;
	                }
	            }
	        }
	        
	        return false;
	    }
	    
	    static boolean dfs(int s,ArrayList<ArrayList<Integer>> list, boolean[] vis,boolean []anc){
	        if(anc[s])
	        return true;
	        
	        if(vis[s])
	        return false;
	        
	        vis[s]=true;
	        anc[s]=true;
	        for(int x: list.get(s)){
	            // if(!vis[x]){
	                if(dfs(x,list,vis,anc)){
	                    return true;
	                }
	        }
	                anc[s]=false;
	  
	        return false;
	    }
	    
	    
	    
	
}
