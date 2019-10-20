package gfgdsa.recurssion;

public class Print1toNWithoutLoop {

	public static void PrintNo(int N) {
		if(N==0) {
			return;
		}
		System.out.print(N+" ");
		PrintNo(N-1);
//		System.out.print(N+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNo(10);
	}

}
