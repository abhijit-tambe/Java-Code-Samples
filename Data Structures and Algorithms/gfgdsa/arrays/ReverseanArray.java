package gfgdsa.arrays;

public class ReverseanArray {
public static void rev(int [] arr,int low,int high) {
	int temp;
	while(low<high)
	{
		temp = arr[low];
		arr[low]=arr[high];
		arr[high]=temp;
		low++;
		high--;
		
	}
	for(int a:arr) {
		System.out.print(a+" ");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1,2,3,4,5,6,7};
		rev(a,0,a.length-1);	
	}

}
