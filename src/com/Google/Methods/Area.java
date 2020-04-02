package com.Google.Methods;

public class Area {
	// accessmodifier static returntype methodname(arguments/parameters)
	public static double areaOfCircle(int radius) {
		double result = 3.14 * radius * radius;
		return result;
	}

	public static int areaOfRectangle(int length, int width) {
		int result = length * width;
		return result;
	}

	public double areaOfTriangle(double height, double base) {
		double result = (height * base) / 2;
		return result;
	}
}
