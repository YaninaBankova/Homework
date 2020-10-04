package edu.smg;
import java.util.Scanner;
public class StarPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of lines of the pyramid!");
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		sc.close();
		for (int i = 0; i < lines; i++) {
			for(int j = lines; j < lines + i; j++){
				System.out.print(" ");
			}
			for(int j = 0; j < lines - i; j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
