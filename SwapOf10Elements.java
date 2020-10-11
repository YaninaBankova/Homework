package edu.smg;

import java.util.Random;
import java.util.Scanner;

public class SwapOf10Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String [] elements = new String[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter element " + (i+1));
			elements[i] = sc.nextLine();
		}
		sc.close();
		int k;
		String swap;
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			k = rand.nextInt(10);
			swap = elements[i];
			elements[i] = elements[k];
			elements[k] = swap;
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(elements[i]);
		}
	}

}
