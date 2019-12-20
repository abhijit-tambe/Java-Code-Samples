

package gfgdsa.graphs;

public class Prims {

	
	public static int min(int[]key,boolean []mst,int V) {
		int min = Integer.MAX_VALUE;
		int min_index=-1;
		for(int i=0;i<V;i++) {
			if(mst[i]==false&&key[i]<min) {
				min=key[i];
				min_index=i;
			}
		}
		
		return min_index;
	}
	
	
	
	public static void primMST(int [][]graph) {
		//create a key array
		
		int V= graph.length;
		int key[] = new int[V];
		boolean mst[] = new boolean[V];
		int parent [] = new int [V];
		
		for(int i=0;i<V;i++) {
			key[i] =Integer.MAX_VALUE;
			parent[i] = 0;
		}
		key[0] =0;
		parent[0]=-1;
		for(int i=0;i<V-1;i++) {
			
			int u = min(key,mst,V);
			mst[i] =true;
			
			
			for(int v =0;v<V;v++) {
				if(graph[u][v]!=0&&mst[v]==false&&graph[u][v]<key[v]) {
					key[v]=graph[u][v];
					parent[v]=u;
				}
				
				
			}
		}
		
		
		for(int i=1;i<V;i++) {
			System.out.println(parent[i] +" - "+ i +" = " +key[i]);
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int graph[][] = new int[][] { { 0, 2, 0, 6, 0 }, 
            { 2, 0, 3, 8, 5 }, 
            { 0, 3, 0, 0, 7 }, 
            { 6, 8, 0, 0, 9 }, 
            { 0, 5, 7, 9, 0 } };  
            primMST(graph);

	}

}
