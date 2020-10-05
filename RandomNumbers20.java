package edu.smg;

public class RandomNumbers20 {
	public static void main(String[] args) {
		double rand;
		int[] number = new int[20];
		for(int i = 0; i < 20; i++){
			rand = Math.random();
			number[i] = (int)(rand * 100);
			System.out.print(number[i] + " ");
		}
	}
}
