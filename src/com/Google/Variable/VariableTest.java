package com.Google.Variable;

public class VariableTest {
	private static int aS=10; //static variable or class variable
	private static int bS=20;
	private int aNS=10; //non static variable or instance variable
	private int bNS=20;
	

	public static void main(String[] args) {
		
		System.out.println(VariableTest.aS);
		VariableTest.bS=40;
		System.out.println(VariableTest.bS);
		System.out.println("-------------------");
		
		VariableTest obj1=new VariableTest();
		System.out.println(obj1);
		obj1.bNS=40;
		System.out.println("-------------------");
		
		VariableTest obj2=new VariableTest();
		System.out.println(obj2);
		System.out.println("-------------------");
		
		VariableTest obj3=new VariableTest();
		System.out.println(obj3);
		System.out.println("-------------------");
		
		obj2.bNS=650;
		
		obj1=obj2;
		obj1.aNS=450;
		System.out.println(obj1.aNS); 
		System.out.println(obj1.bNS); 
		System.out.println(obj3.aNS);
		System.out.println(obj3.bNS); 
		

	}

}
