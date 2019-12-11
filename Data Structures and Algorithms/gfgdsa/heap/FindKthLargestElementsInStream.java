package gfgdsa.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindKthLargestElementsInStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[] = {5,15,6,3,10,20,50,60};
		
//		3,5,6,10,15,20,50
			boolean flag =false;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		int k =3;
		
		for(int x :a ) {
		
			if((pq.size()==k)&&!flag) {
				flag =true;
				System.out.println(pq.peek());
				
			}			
			if(pq.size()<k)
			{
				pq.add(x);
			}
			
			else {
				if(x>pq.peek()) {
					pq.poll();
					pq.add(x);
				}
				System.out.println(pq.peek());
			}
		}

	}

}
