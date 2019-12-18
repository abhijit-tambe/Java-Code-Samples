/*Implementing Dijkstra | Set 1 (Adjacency Matrix)
 * Given a graph of V nodes represented in the form of adjacency matrix. The task is to find the shortest distance of all the vertex's from the source vertex.

Input:
The first line of input contains an integer T denoting the number of test cases . Then T test cases follow .The first line of each test case contains an integer V denoting the size of the adjacency matrix  and in the next line are 2*V space separated values, which denotes the weight of an edge of the matrix (graph). The third line of each test case contains an integer denoting the source vertex s.

Output:
For each test case output will be V space separated integers where the ith integer denote the shortest distance of ith vertex from source vertex.

You task:
You are required to complete the function dijkstra() which takes 3 arguments. The first argument is the adjacency matrix (graph), the second argument is the source vertex s and the third argument is V denoting the size of the matrix. The function prints  V space separated integers where i'th integer denotes the shortest distance of the i'th vertex from source vertex.

Constraints:
1 <= T <= 20 
1 <= V <= 20
0 <= graph[i][j] <= 1000
0 <= s

Example:
Input:
2
2
0 25 25 0
0
3
0 1 43 1 0 6 43 6 0
2

Output:
0 25
7 6 0

Explanation:
Testcase 1: Shortest distance of source node 0 to 1 is 25, and shortest distance of source to source is 0.
 * */
package gfgdsa.graphs;

import java.util.ArrayList;
import java.util.List;

public class Dijkstra {


	
	    
	    static int min(int [] key,boolean [] vis){
	        int min = Integer.MAX_VALUE;
	        int min_idx = -1;
	        for(int i=0;i<key.length;i++){
	            if(!vis[i]&&key[i]<min){
	                min = key[i];
	                min_idx = i;
	            }
	        }
	        return min_idx;
	    }
	    
	    
	    static void dijkstra(ArrayList<ArrayList<Integer>> list, int src, int V)
	    {
	        // add your code
	        boolean vis[] =new boolean[V];
	        int key[] = new int [V]; // key = distance from source
	        int parent[] = new int [V];
	        
	        for(int i=0;i<V;i++){
	            key[i] = Integer.MAX_VALUE;
	        }
	        
	        key[src] = 0;
	        
	        for(int i=0;i<V;i++){
	            int u = min(key,vis);
	            vis[u] = true;
	            List <Integer> l = list.get(u);
	            
	            for(int v=0;v<V;v++){
	            if(!vis[v]&&(l.get(v)!=0)&&(l.get(v)+key[u])<key[v]){
	                key[v] =l.get(v)+key[u];
	                parent[v]=u;
	            }    
	            }
	            
	        }
	        
	        for(int sd:key){
	            System.out.print(sd+" ");
	        }
	        
	    }
}
