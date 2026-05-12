package practiceQuestionEmployee;

public class EmployeeTest {
	public static void main(String[] args) {
		Engineer egr = new Engineer(101, "Jane Smith", "012-34-5678", 120_345.27);
		Manager mgr = new Manager(207, "Barbara Johnson", "054-12-2367", 109501.36, "US Marketing");
		Admin adm = new Admin(304, "Bill Munroe", "108-23-6509", 75_002.34);
		Director dir = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00);

//==========Tried without parameterized constructor====================
		/*
		 * Employee emp = new Employee(); emp.setName("Khush");
		 * System.out.println(emp.getName());
		 * 
		 * Engineer egr = new Engineer(); Manager mgr = new Manager(); Admin adm = new
		 * Admin(); Director dir = new Director();
		 */
//=========Done Successfully===========================================

		// Checking Increased salary for Engineer
		egr.salaryBeforeRaised();
		egr.raisedSalary(5000);
		System.out.println();

		// Calling the printEmployee() method using object of the related class
		egr.printEmployee();
		System.out.println();
		// Checking renamed name for Manager
		mgr.setName("John Doe");
		mgr.printEmployee();
		System.out.println();
		adm.printEmployee();
		System.out.println();
		dir.printEmployee();
	}
}
