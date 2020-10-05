package edu.smg;

import java.util.Scanner;

public class Test11E {
	public static void main(String[] args) {
		int[] score = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 5; i++){
			System.out.println("What is the score of student " + (i+1));
			score [i] = sc.nextInt();
		}
		
		sc.close();
		for(int i = 0; i < 5; i++){
			System.out.println(i+1+" student:" + score[i]+ " points!");
		}
	}
}
