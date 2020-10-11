package edu.smg;

import java.util.Scanner;

public class Matrix5x5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matrix = new int[5][5];
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.println("Enter a number on place " + i + j);
				matrix[i][j] = sc.nextInt();
			}
		}
		sc.close();
		int sum = 0;
		int max = 0;
		int maxSumRow = 0;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				sum += matrix[i][j];
			}
			if (i == 0 || sum > max) {
				max = sum;
				maxSumRow = i + 1;
			}
			sum = 0;
		}
		System.out.println("The biggest sum is in row " + maxSumRow);
	}
}
