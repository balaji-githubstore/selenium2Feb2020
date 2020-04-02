package com.Google.loops;

public class LoopsDemo {

	public static void main(String[] args) {

		// 1 to 50
		// intial
		// end
		// iteration

		// i++ or ++i --> i = i+1
//		for(int i=0;i<=50;i=i+5)
//		{
//			System.out.println(i);
//		}

//		int[] numbs= {5,8,9,5,45,78,89,29};
//		//print only numbers >= 30
//		
//	   	int size = numbs.length;
//		System.out.println(size);

//		for(int i=0;i<size;i++)
//		{
//			System.out.println(i);
//			System.out.println(numbs[i]);	
//		}
//		  System.out.println(size);
//		  
//		  for( int i=0; i<size; i++) 
//		  {
//		   if(numbs[i]>= 30)
//		   System.out.println(numbs[i]);
//		  }
		int[] numbs = { 5, 8, 9, 5, 45, 78, 89, 29 };

		for (int i = 0; i < numbs.length; i++) 
		{
			System.out.println(i);		
			System.out.println(numbs[i]);
			System.out.println("-----");
		}

		
		for(int var : numbs)
		{
			System.out.println(var);
		}
		

		//while -- should meet end point
		
		int i=11;
		
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
		
		i=1;
		//do..while --> check conditions at the end. So life time is minimum once it will run
		do
		{
			System.out.println(i);
			i++;
		}while(i<=10);
			
	
	}

}
