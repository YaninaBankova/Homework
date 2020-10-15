package edu.smg;

import java.util.Scanner;

public class Sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] sudoku = new int[9][9];
		for(int i = 0; i < 9; i++) {
			System.out.println("Enter the " + (i + 1) + " row.");
			for(int j = 0; j < 9; j++) {
				sudoku[i][j] = sc.nextInt();
			}
		}
		sc.close();
		boolean notSudoku = false;
		for(int i = 0; i < 9; i++) {
			for(int k = 1; k < 10; k++) {
				for(int j = 0; j < 9; j++) {
					if(k == sudoku[i][j]) {
						notSudoku = false;
						break;
					} else {
						notSudoku = true;
					}
				}
				if(notSudoku)
					break;
			}
			if(notSudoku)
				break;
		}
		while(!notSudoku) {
			for(int i = 0; i < 9; i++) {
				for(int k = 1; k < 10; k++) {
					for(int j = 0; j < 9; j++) {
						if(k == sudoku[j][i]) {
							notSudoku = false;
							break;
						} else {
							notSudoku = true;
						}
					}
					if(notSudoku)
						break;
				}
				if(notSudoku)
					break;
			}
			break;
		}
		if(notSudoku) {
			System.out.println("This is not a solution for sudoku!");
		} else {
			System.out.println("This is a solution for sudoku!");
		}
	}

}
