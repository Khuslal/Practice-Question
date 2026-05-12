package practiceQuestionEmployee;

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
		System.out.println("Previous salary : " + salary);
	}

	// Raise Salary Method
	public void raisedSalary(double increase) {
		increased_salary = increase;
		salary += increase;
		System.out.println("Raised Salary: " + increased_salary);
		System.out.println("Total Salary After Raised : " + salary);

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
		System.out.println("Employee ID: " + empId);
		System.out.println("Name: " + name);
		System.out.println("SSN: " + ssn);
		System.out.println("Salary: " + salary);
	}
}
