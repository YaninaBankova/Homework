package edu.smg;

import java.util.Scanner;

public class KeyForTheAnswers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many questions are there?");
		int questions = sc.nextInt();
		System.out.println("How many students are there?");
		int students = sc.nextInt();
		char[][] answers = new char[students][questions];
		char[] rightAnswers = new char[questions];
		for(int i = 0; i < questions; i++) {
			System.out.print("Right answer on question " + (i + 1) + ": ");
			rightAnswers[i] = sc.next().charAt(0);
		}
		for(int i = 0; i < students; i++) {
			for(int j = 0; j < questions; j++) {
				System.out.print("Answer on question " + (j + 1) + " for student " + (i + 1) + ": ");
				answers[i][j] = sc.next().charAt(0);
			}
		}
		sc.close();
		int points = 0;
		for(int i = 0; i < students; i++) {
			for(int j = 0; j < questions; j++) {
				if(answers[i][j] == rightAnswers[j]) {
					points += 1;
				}
			}
			System.out.println("Student  " + (i + 1) + " has " + points + " points!");
			points = 0;
		}
	}

}
