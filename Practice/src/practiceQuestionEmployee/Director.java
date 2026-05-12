package practiceQuestionEmployee;

public class Director extends Manager {
	private double budget;

	Director(int empId, String name, String ssn, double salary, String deptName, double budget) {
		// calling the super class's parameterized constructor of Director i.e.
		// Manager();
		super(empId, name, ssn, salary, deptName);
		this.budget = budget;
	}

	// ==========Tried without parameterized constructor====================
	// Director() {
	//
	// }
	// =========Done Successfully===========================================

	public double getBudget() {
		return budget;
	}
}
