package gfgdsa.heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class FindKthLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer  a[] = {10,5,6,4,1,8,15};
		// kth largest element
		int k =3;
		List <Integer> l = Arrays.asList(a);
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		PriorityQueue<Integer> p = new PriorityQueue<>();
	
		p.addAll(l);
		System.out.println(p);
		while(p.size()>k)
		p.poll();
		System.out.println(p);
		System.out.println(p.peek());
		
	}

}
