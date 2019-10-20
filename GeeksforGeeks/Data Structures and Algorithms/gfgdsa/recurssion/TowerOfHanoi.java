package gfgdsa.recurssion;

public class TowerOfHanoi {
	public static int moves=0;
	public static void Toi(int N, int from ,int to,int aux) {
		if(N==1) {
//		System.out.println("disk"+N+"moves from"+from +"to"+to);
		System.out.println("move disk " +N +" from rod " +from +" to rod " +to);
			moves++;
			return;
		}
		Toi(N-1,from,aux,to);
//		System.out.println("disk"+N+"moves from"+from +"to"+to);
		System.out.println("move disk " +N +" from rod " +from +" to rod " +to);
		moves++;
		Toi(N-1,aux,to,from);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =20;
		
		Toi(n,1,2,3);
		System.out.println(moves);

	}

}
