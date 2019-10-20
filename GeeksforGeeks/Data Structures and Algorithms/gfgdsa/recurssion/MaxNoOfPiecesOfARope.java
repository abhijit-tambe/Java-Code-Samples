package gfgdsa.recurssion;

public class MaxNoOfPiecesOfARope {

	public static int piece(int n, int a,int b,int c) {
		if(n==0) {return 0;}
		if(n<0) {return -1;}
		int ma,mb,mc; ma=mb=mc=0;
//		System.out.println("ma :"+ma);
		 ma= piece(n-a,a,b,c);
		 mb= piece(n-b,a,b,c);
		 mc= piece(n-c,a,b,c);
		System.out.println(ma +" "+mb+" "+mc);
		int max = (ma>mb?ma:(mb>mc)?mb:mc); 
//		System.out.println(max);
//		return max;
		if(max==-1) {
			return -1;
		}
		return max+1;
	}
//	public static int Maxcuts(int n, int a, int b ,int c) {
//		if(n>0) {
//		if(n==0) {
//			return 0;
//		}
//		return 1+(Maxcuts(n-c,a,b,c));}
//		else return -1;
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int a,b,c;
		a=5; b=2;c=1;
		System.out.println(piece(n,a,b,c));

	}

}
