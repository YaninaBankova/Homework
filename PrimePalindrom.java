package edu.smg;

public class PrimePalindrom {

	public static void main(String[] args) {
		System.out.print(2 + "\t");
		int count = 1;
		int number = 3;
		while(count < 120) {
			if(isPalindrom(number) && isPrime(number)) {
				System.out.print(number + "\t");
				count++;
				if(count % 10 == 0) {
					System.out.println();
				}
			}
			number++;
		}

	}
	public static boolean isPalindrom(int number) {
		boolean palindrom = true;
		int copyNumber = number;
		int reversedNumber = 0;
		while(copyNumber != 0) {
			reversedNumber = reversedNumber * 10 + copyNumber % 10;
			copyNumber /= 10;
		}
		if(reversedNumber != number)
			palindrom = false;
		
		return palindrom;
	}
	public static boolean isPrime(int number) {
		boolean prime = true;
		int maxDevisor = (int)(Math.ceil(Math.sqrt(number)));
		for(int i = 2; i <= maxDevisor; i++) {
			if(number % i == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}

}
