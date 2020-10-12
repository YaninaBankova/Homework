package edu.smg;

import java.util.Scanner;

public class TransponatedMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows?");
		int i = sc.nextInt();
		System.out.println("How many columns?");
		int j = sc.nextInt();
		int[][] matrix = new int[i][j];
		int[][] transponatedMatrix = new int[j][i];
		for(int m = 0; m < i; m++) {
			for(int n = 0; n < j; n++) {
				System.out.println("Enter a number on place " + m + " " + n);
				matrix[m][n] = sc.nextInt();
			}
		}
		sc.close();
		for(int m = 0; m < i; m++) {
			for(int n = 0; n < j; n++) {
				transponatedMatrix[n][m] = matrix[m][n];
			}
		}
		for(int m = 0; m < j; m++) {
			for(int n = 0; n < i; n++) {
				System.out.print(transponatedMatrix[m][n] + "  ");
			}
			System.out.println();
		}
	}

}
