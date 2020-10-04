package edu.smg;

import java.util.Scanner;

public class NumberPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of lines of the pyramid!");
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		sc.close();
		for (int i = 0; i < lines; i++) {
			for(int j = lines - i; j > 0; j--){
				System.out.print(j + " ");
			}
			for(int j = 0; j + i + 1 < lines; j++){
				System.out.print(j + 2 + " ");
			}
			System.out.print("\n");
		}
	}

}
