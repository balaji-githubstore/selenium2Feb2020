package com.Google.Employee;

public class Employee {
	public int empId;
	public String empName;
	public double empSalary;
	public static String empCompany;
	public static int counter=101;
	
	
	public Employee()
	{
		empId=counter;
		counter=counter+1;
	}
	
	
//	public Employee(int id)
//	{
//		System.out.println("Object Created");
//		empId=id;
//	}
	
	
	
	
	
	
	
	
	
	//static method to print employee details

//	public static void printEmployeeDetails(int id,String name, double salary)
//	{
//		System.out.println(id);
//		System.out.println(name);
//		System.out.println(salary);
//	}


	public static void printEmployeeDetails(Employee x) {
		System.out.println(x);
		System.out.println(x.empId);
		System.out.println(x.empName);
		System.out.println(x.empSalary);
		System.out.println(Employee.empCompany);
	}
	
	//gethighlypaidemployee(emp1,emp2) --> return highlypaid employee
	
	public static Employee getHighlyPaidEmployee(Employee x,Employee y)
	{
		if(x.empSalary>y.empSalary)
		{
			//x is highly paid
			return x;
		}
		else
		{
			//y is highly paid
			return y;
		}
	}
	
}
