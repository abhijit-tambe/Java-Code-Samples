package gfgdsa.bitwise;

public class OneOddNoOfElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,3,5,2,3,3};
		int no=0;
		for(int x:a) {
			no = (no^x);
		}
		System.out.println(no);

	}

}
