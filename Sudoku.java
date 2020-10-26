package edu.smg;

import java.util.Scanner;

public class Sudoku {

	public static void main(String[] args) {
		int [][] sudoku = readASolution();
		System.out.println(isValid(sudoku) ? "Valid solution!":"Invalid solution.");
	}
	public static int [][] readASolution(){
		System.out.println("Enter a sudoku solution!");
		int[][] sudoku = new int[9][9];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				sudoku[i][j] = sc.nextInt();
			}
		}
		sc.close();
		return sudoku;
	}
	public static boolean isValid(int[][] sudoku) {
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				if(sudoku[i][j] < 1 || sudoku[i][j] > 9 || !isValid(i, j, sudoku))
					return false;
			}
		}
		return true;
	}
	public static boolean isValid(int i, int j, int[][] sudoku) {
		for(int col = 0; col < 9; col++) {
			if(col != j && sudoku [i][j]==sudoku[i][col])
				return false;
		}
		for(int row = 0; row < 9; row++) {
			if(row != i && sudoku[i][j] == sudoku[row][j])
			return false;
		}
		for(int row = (i/3)*3; row < (i/3)*3+3; row++) {
			for(int col = (j/3)*3; col < (j/3)*3+3; col++) {
				if((col != j || row != i) && sudoku[row][col] == sudoku[i][j])
					return false;
			}
		}
		return true;
	}

}
