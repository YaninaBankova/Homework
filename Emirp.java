package edu.smg;

	public class Emirp {
		public static void main(String[] args) {
		int count = 0;
		int number = 3;
		while(count < 120) {
			if(!isPalindrom(number) && isPrime(number) && isReversedPrime(number)) {
				System.out.print(number + "\t");
				count++;
				if(count % 10 == 0) {
					System.out.println();
				}
			}
			number++;
		}
	
	}
		public static boolean isReversedPrime(int number) {
			boolean reversedPrime = true;
			int copyNumber = number;
			int reversedNumber = 0;
			while(copyNumber != 0) {
				reversedNumber = reversedNumber * 10 + copyNumber % 10;
				copyNumber /= 10;
			}
			int maxDevisor = (int)(Math.ceil(Math.sqrt(reversedNumber)));
			for(int i = 2; i <= maxDevisor; i++) {
				if(reversedNumber % i == 0) {
					reversedPrime = false;
					break;
				}
			}
			return reversedPrime;
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
