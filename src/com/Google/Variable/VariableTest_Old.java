package com.Google.Variable;

public class VariableTest_Old {
	private static int aS=10; //static variable or class variable
	private static int bS=20;
	private int aNS=10; //non static variable or instance variable
	private int bNS=20;
	

	public static void main(String[] args) {
		
		System.out.println(VariableTest_Old.aS);
		VariableTest_Old.bS=40;
		System.out.println(VariableTest_Old.bS);
		System.out.println("-------------------");
		
		VariableTest_Old obj1=new VariableTest_Old();
		System.out.println(obj1);
		System.out.println(obj1.aNS);
		obj1.bNS=40;
		System.out.println(obj1.bNS);
		System.out.println("-------------------");
		
		VariableTest_Old obj2=new VariableTest_Old();
		System.out.println(obj2);
		System.out.println(obj2.aNS);
		System.out.println(obj2.bNS);
		System.out.println("-------------------");
		
		VariableTest_Old obj3=new VariableTest_Old();
		System.out.println(obj3);
		System.out.println(obj3.aNS);
		System.out.println(obj3.bNS);
		System.out.println("-------------------");
	
		
		

	}

}
