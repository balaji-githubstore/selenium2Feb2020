package com.Google.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		
		
		System.out.println("Hello Balaji");
		
		
		
		Employee.empCompany="Google";

		Employee emp1=new Employee();
		//emp1.empId=101;
		emp1.empName="Jack";
		emp1.empSalary=3000;
		//emp1.empCompany="Google";	
		
		//Employee a =emp1;
		
		
		System.out.println(emp1);
		
		Employee.printEmployeeDetails(emp1);
		
		System.out.println("----------------------");
		
		Employee emp2=new Employee();
		//emp2.empId=102;
		emp2.empName="Henry";
		emp2.empSalary=4000;
		//emp2.empCompany="Google";
		System.out.println(emp2);
		Employee.printEmployeeDetails(emp2);
		System.out.println("----------------------");

		
		
		//Create one more empolyee 103,Mark, 5000
		Employee emp3=new Employee();
		//emp3.empId=103;
		emp3.empName="Mark";
		emp3.empSalary=5000;
		//emp2.empCompany="Google";
		System.out.println(emp3);
		
		Employee.printEmployeeDetails(emp3);
		
		System.out.println("----------------------");
		
		
		/*
		 * Employee x =emp1; x=emp2;
		 * 
		 * x=emp3;
		 */
		
		Employee emp4=new Employee();
		
		
		System.out.println("Highly Paid Employee");
		Employee h= Employee.getHighlyPaidEmployee(emp1, emp3);		
		Employee.printEmployeeDetails(h);
		
		
	}

}
