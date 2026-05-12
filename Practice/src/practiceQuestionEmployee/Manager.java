package practiceQuestionEmployee;

public class Manager extends Employee {
	private String deptName;

	// Constructor
	Manager(int empId, String name, String ssn, double salary, String deptName) {
		// call Employee parameterized constructor/ Initialize Employee Fields
		super(empId, name, ssn, salary);
		this.deptName = deptName; // Initialize Manager-specific field
	}

	// ==========Tried without parameterized constructor====================
	// Manager() {
	//
	// }
	// =========Done Successfully===========================================

	public String getDeptName() {
		return deptName;
	}
}
