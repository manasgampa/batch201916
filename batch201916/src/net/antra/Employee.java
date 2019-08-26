package net.antra;

import java.io.Serializable;

public class Employee{

	private int employeeId;
	public Employee(int employeeId) {
		this.employeeId=employeeId;
	}
	
	public boolean equals(Object obj) {
		Employee emp=(Employee)obj;
		int empid1=emp.employeeId;//35
		int empid2=this.employeeId;//12
		if(empid1==empid2) {
		return true;
		}else {
			
			return false;
		}
		
	}
	/*public int hashCode() {
		
		return 123;
	}
	
	public String toString() {
		
		Class c=getClass();
		String str=c.getName();
		return str+"@"+Integer.toHexString(hashCode());
	}*/
	/*public Employee() {
		System.out.println("in employee Constructor");
	}
	static{
		System.out.println("in static blocks");
	}
	
	{
		System.out.println("in instance block");
	}
	
	
	public Employee(int empId, String name) {
		
		System.out.println(empId+" "+name);
	}
	
	public void setEmployeeId(int id) {
		employeeId=id;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}*/
}
