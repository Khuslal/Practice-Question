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
		//	Employee() {
		//
		//	}
	// =========Done Successfully===========================================

	// Name setter
	public void setName(String name) {
		this.name = name;
	}

	// Salary Before Raised
	public void salaryBeforeRaised() {
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		String sal = cf.format(salary);
		System.out.println("Previous salary : " + sal);
	}

	// Raise Salary Method
	public void raisedSalary(double increase) {
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		String sal = cf.format(salary);
		String increasedSal = cf.format(increased_salary);
		increased_salary = increase;
		salary += increase;
		System.out.println("Raised Salary: " + increasedSal);
		System.out.println("Total Salary After Raised : " + sal);

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
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
		String formattedSalary = currencyFormat.format(getSalary());
		System.out.println("Employee ID: " + getEmpId());
		System.out.println("Name: " + getName());
		System.out.println("SSN: " + getSsn());
		System.out.println("Salary: " + formattedSalary);
	}
}
