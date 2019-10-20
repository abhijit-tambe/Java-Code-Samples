package gfgdsa.recurssion;

public class findAnElementInAnArray {
public static boolean find(int a[],int x,int index) {
	if(index > a.length-1) {
		return false;
	}
	if(a[index]==x) {
//		System.out.println(true);
		return true;
	}
	return find(a,x,index+1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		int x=5;
		System.out.println(find(arr,x,0));
	}

}
