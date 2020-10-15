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
		boolean sameCard = false;
		do {
			for(int i = 0; i < 4; i++) {
				if(i < 3 && cards[i][0] == cards[i+1][0] && cards[i][1] == cards[i+1][0]) {
					sameCard = true;
					cards[i][0] = rand.nextInt(13);
					cards[i][1] = rand.nextInt(4);
				}
				if(i < 2 && cards[i][0] == cards[i+2][0] && cards[i][1] == cards[i+2][0]) {
					sameCard = true;
					cards[i][0] = rand.nextInt(13);
					cards[i][1] = rand.nextInt(4);
				}
				if(cards[0][0] == cards[3][0] && cards[0][1] == cards[3][0]) {
					sameCard = true;
					cards[i][0] = rand.nextInt(13);
					cards[i][1] = rand.nextInt(4);
				}
			}
		} while(sameCard);
		for(int i = 0; i < 4; i++){
			System.out.println(rankKind[cards[i][0]] + " of " + colorKind[cards[i][1]]);
		}
	}

}
