/*input aab
 * bacaabaa
 * output
 * 3
 * aab
 * aba
 * baa
 * 
 * */
package gfgdsa.introduction;

import java.util.Scanner;

public class RollingHash {

	public static void findHash(String str, String a, int sum) {
		boolean flag = false;
		int l = a.length();
		
		
		
//		//O(n x m)////////////////////////////////////
//		for(int i=0;i<=str.length()-l;i++) {
//			int csum=0;
//				for(int j=i;j<i+l;j++) {
//					csum+=(int)str.charAt(j)-'a'+1;	
//				}
//				if(csum==sum) {
//					System.out.println(csum+" "+sum);
//					flag=true;
////					for(int k=i;k<i+l;k++) {
////						System.out.print(str.charAt(k));	
////					}	
//					System.out.println(str.substring(i,i+l));
//				}		
//		}
		////////////////////////////////////////

		///// O(n+m)
		int csum = 0;
		for (int i = 0; i < l; i++) {
			csum += (int) str.charAt(i) - 'a' + 1;
			if (csum == sum) {
				flag = true;
				System.out.println(str.substring(0, l));
			}
//			System.out.println(csum); 
		}
//		System.out.println(csum); 
		for (int i = 1; i + l - 1 < str.length(); i++) {
			csum += ((int) str.charAt(l + i - 1) - 'a' + 1);
			csum -= (int) str.charAt(i - 1) - 'a' + 1;
//			System.out.println(csum);
			if (csum == sum) {
				flag = true;
				System.out.println(str.substring(i, l + i));
			}
		}
		if (!flag) {
			System.out.println("-1");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine(); // hash
		String str = sc.nextLine();
		int sum = 0;
		for (int i = 0; i < a.length(); i++) {
//			System.out.println((int)a.charAt(i)-96);
			sum += (int) a.charAt(i) - 'a' + 1; // sum of hash
		}
//		System.out.println("sum : "+sum);
		findHash(str, a, sum);
	}

}
