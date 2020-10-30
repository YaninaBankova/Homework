package edu.smg;

public class Craps {

	public static void main(String[] args) {
		int k = 0;
		boolean play = true;
		int point = 0;
		int firstDice;
		int secondDice;
		int sum;
		do {
			firstDice = rollADice(k);
			secondDice = rollADice(k);
			sum = firstDice + secondDice;
			System.out.println("You rolled " + firstDice + " + " + secondDice + " = " + sum);
			if(point == 0) {
				if(sum == 2 || sum == 3 || sum == 12) {
					System.out.println("You lose");
					play = false;
				} else if (sum == 7 || sum == 11) {
					System.out.println("You win");
					play = false;
				} else {
					point = sum;
					System.out.println("Point is " + point);
				}
			} else {
				if (sum == 7) {
					System.out.println("You lose");
					play = false;
				} else if (sum == point) {
					System.out.println("You win");
					play = false;
				}
			}
			
		} while(play);
	}
	
	public static int rollADice(int diceValue) {
		diceValue = (int)(Math.random() * 6) + 1;
		return diceValue;
	}

}
