package edu.smg;
import java.util.Scanner;
public class Paint {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the height of the room?");
		double height = sc.nextDouble();
		System.out.println("What is the length of the room?");
		double length = sc.nextDouble();
		System.out.println("What is the width of the room?");
		double width = sc.nextDouble();
		sc.close();
		double squareMetersOfWalls = 2 * height * length + 2 * height * width + width * length;
		int bucket5Liter = (int)squareMetersOfWalls / 140;
		int bucket1Liter = ((int)squareMetersOfWalls % 140) / 30;
		if (((int)squareMetersOfWalls % 140) % 30 != 0)
			bucket1Liter++;
		if (bucket5Liter * 15 + bucket1Liter * 4 < (bucket5Liter + 1) * 15)
			System.out.println("For the painting of " + squareMetersOfWalls + 
					" square meters you need " + bucket5Liter + " 5-liter buckets and " + 
					bucket1Liter + " 1-liter buckets. It will cost you " + 
					(bucket5Liter * 15 + bucket1Liter * 4) + " dollars.");
		else
			System.out.println("For the painting of " + squareMetersOfWalls + 
					" square meters you need only " + (bucket5Liter + 1) + " 5-liter buckets. It will cost you " + 
					((bucket5Liter + 1) * 15) + " dollars.");
	}
}
