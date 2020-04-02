package com.Google.DecisionMaking;

public class DecisionMakingTest {

	public static void main(String[] args) {
		
	String expectedTitle = "google";
	
	if(expectedTitle == "Google" || expectedTitle =="google" )
	{
		System.out.println("Test Passed-Google!!");
	}
	else if(expectedTitle == "Gmail")
	{
		System.out.println("Test Passed-Gmail!!");
	}
	else if(expectedTitle == "Google Sheet")
	{
		System.out.println("Test Passed-Sheet!!");
	}
	else
	{
		System.out.println("Test Failed!!");
	}
	
	
	switch (expectedTitle) {
	case "Google":
	case "google":
		System.out.println("Google title");
		break;
	case "Gmail":
		System.out.println("Gmail title");
		break;
	case "Google Sheet":
		System.out.println("Google title");
		break;
	default:
		System.out.println("Not matching");
		break;
	}
	
	
	
	
	
	
	
	
	
	
		
	int pageNumber = 210;
	
	//between 100 (include) and 200(include)
	
//	if(pageNumber >= 100)
//	{
//		if(pageNumber<=200)
//		{
//			System.out.println("Yes! falls between 100 and 200");
//		}
//	}
	
//	if(pageNumber>=100 && pageNumber<=200)
//	{
//		System.out.println("Yes! falls between 100 and 200");
//	}
	
	System.out.println(!(pageNumber>=100 && pageNumber<=200));
	if(!(pageNumber>=100 && pageNumber<=200))
	{
		System.out.println("Report the team. Not falling between 100 and 200");
	}
	
	int mark = -90;
	//90 to 100 --> grade A
	//80 to 89 -->Grade B
	//70 to 79 -->Grade C
	//60 to 69 -->Grade D
	//50 to 59 --> Grade E
	//<50 --> Grade F
	//negative value or greater than 100 --> Invalid marks

	
	
	 int marks= 49;
	  
	  if(marks>=90 && marks<=100)
	  {
	   System.out.println("Grade A");
	  }
	  else if(marks >=80 && marks<=89)
	  {
	   System.out.println("Grade B");
	   }
	  else if(marks>=70 && marks<=79)
	  {
	   System.out.println("Grade C");
	   
	  }
	  
	  else if(marks>=60 && marks<=69)
	  {
	   System.out.println("Grade D");
	   
	  }
	  
	  else if(marks>=50 && marks<=59)
	  {
	   System.out.println("Grade E");
	   
	  }
	  else if(!(marks<50 && marks >=0))
	  {
	   System.out.println("invalid marks, you have entered either a negative number or a number greater than 100. Please verify the number.");
	   
	  }
	  else
	  {
	   System.out.println("Grade F- failed");
	   
	  }
	  
	
	
	

	}
}
