package com.Google.datatypes;

public class DatatypesDemo {

	public static void main(String[] args) {
		
//		byte a=100; //8*1000 bits 
//
//		int b=100;//32*1000 bit
//		
//		long c=0; //64 bit
//		
//		char letter =';'; //16 bit
//		
//		double e = 1.123456789;
//		System.out.println(e);
//		
//		
//		float f=(float) e; //explicit conversion --> lead to data loss
//		
//		System.out.println(f);
		
		
		/*
		 * float a =1.2f;
		 * 
		 * long b=122145454545L;
		 */
	
		//non - pr
		//collection of primitive datatypes
		//blue
//		char[] letters =new char[2];
//		letters[0]='n';
//		letters[1]='o';
//				
//		String name =new String(letters);
		
		String name ="blue"; //4*16
		System.out.println(name);
		
		int[] numbers = new int[5];
		//size -->5(index - 0 to 4) //5*32
		
		System.out.println(numbers);
		numbers[0]=15;
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		
		System.out.println("---------------");
		int[] numbs= {5,8,9,5};
		
	   	int size = numbs.length;
		System.out.println(size);
		
		System.out.println(numbs[2]); //
		
		System.out.println("---------------");
//		String[] names=new String[3];
//		names[0]="king";
//		names[1]="queen";
//		System.out.println(names[0]);
//		System.out.println(names[1]);
		
		//king,queen,jack
		
		String[] names=  {"King", "Queen", "Jack"};
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);

	}
}
