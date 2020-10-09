package edu.smg;
import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first word or phrase!");
		String firstWord = sc.nextLine();
		System.out.println("Enter the second word or phrase!");
		String secondWord = sc.nextLine();
		sc.close();
		int firstLength = firstWord.length();
		firstWord = firstWord.toLowerCase();
		secondWord = secondWord.toLowerCase();
		String copySecondWord = secondWord;
        boolean anagram = true;
        for(int i = 0; i < firstLength; i++) {
        	char currentChar = firstWord.charAt(i);
        	if(currentChar >= 'a' && currentChar <= 'z') {
        		int indexOfChar = copySecondWord.indexOf(currentChar);
        		if(indexOfChar == -1) {
        			anagram = false;
        			break;
        		}
        		copySecondWord = copySecondWord.substring(0, indexOfChar) + 
        				copySecondWord.substring(indexOfChar + 1);
        	}
        }
        if(anagram) {
        	int remainingLetters = copySecondWord.length();
        	for(int i = 0; i < remainingLetters; i++) {
        		char currentChar = copySecondWord.charAt(i);
        		if(currentChar >= 'a' && currentChar <= 'z') {
        			anagram = false;
        			break;
        		}
        	}
        }
        if (anagram)
        	System.out.println("They are anagrams!");
        else 
        	System.out.println("They aren\'t anagrams.");
	}

}
