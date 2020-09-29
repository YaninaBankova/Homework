package edu.smg;
import java.util.Scanner;

public class ColorRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a color code");
		Scanner sc = new Scanner(System.in);
		double colorCode = sc.nextDouble();
		sc.close();
		if (colorCode > 750)
			System.out.println("The entered wavelength is not a part of the visible spectrum");
		else if (colorCode > 620)
			System.out.println("The color is Red");
		else if (colorCode > 590)
			System.out.println("The color is Orange");
		else if (colorCode > 570)
			System.out.println("The color is Yellow");
		else if (colorCode > 495)
			System.out.println("The color is Green");
		else if (colorCode > 450)
			System.out.println("The color is Blue");
		else if (colorCode > 380)
			System.out.println("The color is Violet");
		else
			System.out.println("The entered wavelength is not a part of the visible spectrum");
	}

}
