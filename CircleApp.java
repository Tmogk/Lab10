package co.grandcircus;

import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int radius;
		String cont = "y";

		do {

			// prompt for input
			// instance of the circle class
			System.out.println("Enter the radius of the circle: ");
			radius = scnr.nextInt();

			Circle circle = new Circle();

			circle.setRadius(radius);

			System.out.println("Circumference: " + circle.getFormattedCircumference());
			System.out.printf("Area: " + circle.getFormattedArea());

			System.out.println("Would you like to go again? (y/n)");
			cont = scnr.next();

		} while (cont == "y");

		System.out.println("Goodbye");

	}

}
