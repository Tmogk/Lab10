package co.grandcircus;

public class Circle {

	private double radius;

	private static String formatNumber(double x) {
		String numberAsString = Double.toString(x);
		numberAsString = String.format("%.2s", numberAsString);
		return numberAsString;

	}

	public Circle() {
		radius = 0.0;
	}

	public Circle(double rad) {
		radius = rad;

	}

	public void setRadius(double rad) {
		radius = rad;
	}

	public double getCircumference() {
		return 2 * Math.PI * radius;

	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public String getFormattedCircumference() {
		return formatNumber(getCircumference());

	}

	public String getFormattedArea() {
		return formatNumber(getArea());

	}

}
