package edu.smg;

import java.util.Random;

public class Random4Cards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] colorKind = {"Clubs","Diamonds","Hearts","Spades"};
		String[] rankKind = {"A","K","Q","J","10","9","8","7","6","5","4","3","2"};
		int color;
		int rank;
		int[][] cards = new int[4][2];
		Random rand = new Random();
		for(int i = 0; i < 4; i++){
			color = rand.nextInt(4);
			rank = rand.nextInt(13);
			cards[i][0] = rank;
			cards[i][1] = color;
		}
		for(int i = 0; i < 4; i++){
			System.out.println(rankKind[cards[i][0]] + " of " + colorKind[cards[i][1]]);
		}
	}

}
