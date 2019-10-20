/*
 * The cost of stock on each day is given in an array A[] of size N. Find all the days on which you buy and sell the stock so that in between those days your profit is maximum.

Input: 
First line contains number of test cases T. First line of each test case contains an integer value N denoting the number of days, followed by an array of stock prices of N days. 

Output:
For each testcase, output all the days with profit in a single line. And if there is no profit then print "No Profit".

User Task:
The task is to complete the function stockBuySell() which finds the days of buying and selling stock and print them. The newline is automatically added by the driver code.

Constraints:
1 <= T <= 100
2 <= N <= 103
0 <= Ai <= 104

Example
Input:
3
7
100 180 260 310 40 535 695
10
23 13 25 29 33 19 34 45 65 67
5
4 2 2 2 4

Output:
(0 3) (4 6)
(1 4) (5 9)
(3 4)

Explanation:
Testcase 1: We can buy stock on day 0, and sell it on 3rd day, which will give us maximum profit.

Note: Output format is as follows - (buy_day sell_day) (buy_day sell_day)
For each input, output should be in a single line.
 * 
 * 
 * */

package gfgdsa.arrays;

import java.util.Scanner;

public class StockBuyAndSell {
	
	public static void stockBuySell(int [] price, int n) {
//		int[] price = { 100, 180, 260, 310, 40, 535, 695, 50, 4, 60 };
		boolean flag = false;
		boolean profit = false;
		int buy, sell;
		buy = sell = 0;

		for (int i = 1; i < price.length; i++) {
			if (price[i] <= price[i - 1]) {
				if (buy != sell && sell != 0 && flag) {
					System.out.printf("(%d %d) ", buy, sell);
					profit = true;
				}
				buy = i;
				flag = false;
			}
			if (price[i] > price[i - 1]) {
				flag = true;
				sell = i;
			}
			if (i == price.length - 1 && flag) {
				System.out.printf("(%d %d)", buy, sell);
				profit = true;
			}
		}

		if (!profit) {
			System.out.printf("No Profit");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
//			int s = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			stockBuySell(arr, n);
		}
	}

}
