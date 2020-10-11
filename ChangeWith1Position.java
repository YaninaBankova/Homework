package edu.smg;

import java.util.Scanner;

public class ChangeWith1Position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String [] elements = new String[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter element " + (i+1));
			elements[i] = sc.nextLine();
		}
		sc.close();
		String swap, firstElement = elements[0];
		for (int i = 1; i < 10; i++) {
			swap = elements[i-1];
			elements[i-1] = elements[i];
			elements[i] = swap;
		}
		elements[9] = firstElement;
		for(int i = 0; i < 10; i++) {
			System.out.println(elements[i]);
		}
	}

}
