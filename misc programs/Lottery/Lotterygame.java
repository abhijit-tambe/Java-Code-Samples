//package Lottery;

import java.util.Arrays;
import java.util.Random;

public class Lotterygame {
	static private int count=0;
	private int winner;
	private int L;
	private final int [] MAX_NO_LOTTERY = new int [10];
	
	public int winningNo(int winner) {
		this.winner = winner;
		return MAX_NO_LOTTERY[this.winner];
	}
	
	public String getMAX_NO_LOTTERY() {
		return Arrays.toString(MAX_NO_LOTTERY).toString();
	}
	
	public void setMAX_NO_LOTTERY(int n) {
		if(count<10) {
		MAX_NO_LOTTERY [count]= n;
				}
		count+=1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lotterygame game = new Lotterygame();
		
		Random r = new Random();
		int no = 0;
		for(int i=0;i<10;i++) {

		double v = Math.floor((Math.random() * ((999999) - 100000) + 1) + 100000);

		no =(int)v;
		System.out.println("Lottery no : "+no);
		game.setMAX_NO_LOTTERY(no);
		
		}
		int w = game.winningNo(game.winner = r.nextInt(10));
		 System.out.println(game.getMAX_NO_LOTTERY());
		 System.out.println("wining no is "+w );
	

	}

}
