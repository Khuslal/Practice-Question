package practiceQuestionEmployee;

import java.text.NumberFormat;

public class Employee {
	private int empId;
	private String name;
	private String ssn; // social security number
	private double salary;
	public double increased_salary;

	// Constructor
	Employee(int empId, String name, String ssn, double salary) {
		this.empId = empId;
		this.name = name;
		this.ssn = ssn;
		this.salary = salary;
	}

	// ==========Tried without parameterized constructor====================
	// Employee() {
	//
	// }
	// =========Done Successfully===========================================

	// =========Creating Method for NumberFormat for code reuse.============
	public String formatCurrency(double amount) {

		// Method 1:
		return NumberFormat.getCurrencyInstance().format(amount);
		/*
		 * Method 2: NumberFormat currentFormat = NumberFormat.getCurrencyInstance();
		 * String formattedCurrency = currentFormat.format(amount);
		 */
		/* return formattedCurrency; */

	}

	// Name setter
	public void setName(String name) {
		this.name = name;
	}

	// Salary Before Raised
	public void salaryBeforeRaised() {
//============Need not to use these lines after creating a method for this.============
//		NumberFormat cf = NumberFormat.getCurrencyInstance();
//		String sal = cf.format(salary);
		System.out.println("Previous salary : " + formatCurrency(salary));
	}

	// Raise Salary Method
	public void raisedSalary(double increase) {
		increased_salary = increase;
		salary += increase;
		System.out.println("Raised Salary: " + formatCurrency(increased_salary));
		System.out.println("Total Salary After Raised : " + formatCurrency(salary));

	}

	// getter methods here
	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public String getSsn() {
		return ssn;
	}

	public double getSalary() {
		return salary;
	}

	public void printEmployee() {
		System.out.println("Employee ID: " + getEmpId());
		System.out.println("Name: " + getName());
		System.out.println("SSN: " + getSsn());
		System.out.println("Salary: " + formatCurrency(getSalary()));
	}
}
