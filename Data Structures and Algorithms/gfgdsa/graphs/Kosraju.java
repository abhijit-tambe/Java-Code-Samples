/*Strongly Connected Components (Kosaraju's Algo)
 * Given a graph with N nodes and M directed edges. Your task is to complete the function kosaraju() which returns an integer denoting the number of strongly connected components in the graph.

Input:
The first line of input contains an integer T. Then T test cases follow. Each test case contains two integers N and M . In the next line there are M space separated values u,v denoting an edge from u to v.

Output:
For each test case in a new line output will an integer denoting the no of strongly connected components present in the graph.

User Task:
Since this is a functional problem you don't have to worry about input, you just have to complete the function kosaraju().

Constraints:
1 <= T <= 100
1 <= N,M <= 100
0 <= u,v <= N-1

Example:
Input:
2
5 5
1 0 0 2 2 1 0 3 3 4
3 3
0 1 1 2 2 0

Output:
3
1

Explanation:
Testcase 1:
There is a connected subgraph that includes 0-1-2 which satisfy the condition of strongly connecting components i.e each node is reachable from every other nodes.

Another subgraph includes individual nodes 4 and 3 . That gives us count of total 3 subgraphs satisfying the condition of strongly connected components. 
 * 
 * 
 * */
package gfgdsa.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Kosraju {

	public int kosaraju(ArrayList<ArrayList<Integer>> list, int N) {
		// your code here
		ArrayList<ArrayList<Integer>> rev = new ArrayList<>();
		List<Integer> tempr;
		for (int c = 0; c < N - 1; c++) {
			rev.add(c, new ArrayList<>());
		}
		for (int i = 0; i < N - 1; i++) {
			List temp = list.get(i);

			for (int j = 0; j < temp.size(); j++) {

				tempr = rev.get((int) temp.get(j));
				tempr.add(i);

			}
		}

		boolean vis[] = new boolean[N - 1];
		Stack<Integer> stac = new Stack<>();
		int count = 0;

		List<Integer> l = new ArrayList<>();
		for (int i = 0; i < N - 1; i++) {
			if (!vis[i]) {
				dfs1st(i, list, stac, vis);
			}
		}

		boolean[] vis2 = new boolean[N - 1];

		for (int i = 0; i < N - 1; i++) {
			int p = stac.pop();
			if (!vis2[p]) {

				dfs2nd(p, rev, vis2);
				count++;
			}

		}

		return count;
	}

	void dfs1st(int s, ArrayList<ArrayList<Integer>> list, Stack<Integer> stac, boolean[] vis) {
		if (vis[s]) {
			return;
		}

		vis[s] = true;
		List<Integer> l = list.get(s);

		for (int i = 0; i < l.size(); i++) {
			if (!vis[l.get(i)]) {

				dfs1st(l.get(i), list, stac, vis);
			}
		}
		stac.add(s);

	}

	void dfs2nd(int s, ArrayList<ArrayList<Integer>> rev, boolean[] vis) {
		if (vis[s]) {
			return;
		}

		vis[s] = true;
		List<Integer> l = rev.get(s);

		for (int i = 0; i < l.size(); i++) {
			if (!vis[l.get(i)]) {

				dfs2nd(l.get(i), rev, vis);
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kosraju k = new Kosraju();
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		graph.add(0, new ArrayList<>(Arrays.asList(3, 2)));
		graph.add(1, new ArrayList<>(Arrays.asList(0)));
		graph.add(2, new ArrayList<>(Arrays.asList(1)));
		graph.add(3, new ArrayList<>(Arrays.asList(4)));
		graph.add(4, new ArrayList<>(Arrays.asList()));
		System.out.print(k.kosaraju(graph, graph.size() + 1));
	}

}
