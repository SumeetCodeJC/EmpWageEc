package com.bridgelabz.empwage;

public class EmpWage {
	public static void main(String[] args) {
		int IS_FULL_TIME =1;
		double empcheck = Math.floor(Math.random() * 10) %2;
		if(empcheck == IS_FULL_TIME)
		{
			System.out.print("Employee is Present");
		}
		else {
			System.out.print("Employee is Absent");
		}
	}

}

