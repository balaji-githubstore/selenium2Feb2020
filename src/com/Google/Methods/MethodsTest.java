package com.Google.Methods;

public class MethodsTest {

	public static void main(String[] args) {

		int r = 100;
		double area = Area.areaOfCircle(r);
		System.out.println(area);
		
		area = Area.areaOfCircle(20);
		System.out.println(area);

		int len = 1;
		int wid = 25;

		int result = Area.areaOfRectangle(len, wid);

		System.out.println(result);

		double h = 1;
		double b = 25;
		
		//Declaration
		//instantition
		//intialization
		
		Area x=new Area(); 
		
		double AT = x.areaOfTriangle(h, b);
		System.out.println(AT);

	}

}
