package edu.smg;

import javax.swing.JOptionPane;

public class MultiPlanetaryWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String weightOnEarth = (String) JOptionPane.showInputDialog(null, "What is your weight on Earth?", null, 3);
		double weight = Double.parseDouble(weightOnEarth);
		String [] acceptableValues = {"Mercury", "Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
		String planet = (String) JOptionPane.showInputDialog(null, 
				"On which planet do you want to know your weight?", null, 3, null, acceptableValues, 0);
		double weightOnAnotherPlanet = 0;
		switch (planet){
		case "Mercury" :
			weightOnAnotherPlanet = 0.38 * weight;
			break;
		case "Venus" :
			weightOnAnotherPlanet = 0.91 * weight;
			break;
		case "Mars" :
			weightOnAnotherPlanet = 0.38 * weight;
			break;
		case "Jupiter" :
			weightOnAnotherPlanet = 2.36 * weight;
			break;
		case "Saturn" :
			weightOnAnotherPlanet = 0.92 * weight;
			break;
		case "Uranus" :
			weightOnAnotherPlanet = 0.89 * weight;
			break;
		case "Neptune" :
			weightOnAnotherPlanet = 1.13 * weight;
			break;
		}
		System.out.println("Your weight on " + planet + " is " + weightOnAnotherPlanet + " kg.");
	}

}
