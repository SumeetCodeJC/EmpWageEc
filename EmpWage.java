package com.bridgelabz.empwage;

public class EmpWage {
	public static void main(String[] args){
		int IS_PART_TIME =1;
		int IS_FULL_TIME =2;
		int WAGE_PER_HOUR =20;
		int empHrs = 0;
		int empWage = 0;
		double empcheck = Math.floor(Math.random() * 10) %2;
		if(empcheck == IS_FULL_TIME)
			empHrs = 8;
		else if(empcheck == IS_PART_TIME)
			empHrs = 4;
		else
			empHrs = 0;
		empWage = empHrs * WAGE_PER_HOUR;
		System.out.println("Emp Wage: " + empWage);
		}
}

