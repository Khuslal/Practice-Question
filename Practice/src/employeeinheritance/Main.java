package employeeinheritance;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		Employees e[] = new Employees[2];
		for (int i = 0; i < e.length; i++) {
			Employees em = new Employees();
			System.out.println("Enter id : ");
			// Read the full line as a String and then converts it to an int
			em.setId(Integer.parseInt(scn.nextLine()));

			System.out.println("Enter name : ");
			em.setName(scn.nextLine());

			System.out.println("Enter company : ");
			em.setCompany(scn.nextLine());

			System.out.println("Enter salary : ");
			// em.setSalary(Integer.parseInt(scn.nextLine()));
			// Instead of using Integer.parseInt(scn.nextLine()), we can use below code:
			em.setSalary(scn.nextInt());
			/*
			 * and then to close the /n next line and prevent buffer which skips the below
			 * String input
			 * 
			 */
			scn.nextLine();

			System.out.println("Enter department : ");
			em.setDepartment(scn.nextLine());

			System.out.println("Enter post : ");
			em.setPost(scn.nextLine());

			System.out.println("Enter city : ");
			em.setCity(scn.nextLine());

			System.out.println();
			e[i] = em;
		}

		int totalEmpOfAdmin = 0;
		int totalEmpOfCity = 0;
		int totalSalaryOfDepartment = 0;
		int maxSalary = Integer.MIN_VALUE; //-2147483648
		int minSalary = Integer.MAX_VALUE; // 2147483647
		for (Employees x : e) {
//			System.out.println(x);
			if (x.getName().equalsIgnoreCase("Khush")) {
				System.out.println("Total Salary of " + x.getName() + ": " + x.getSalary());
			}
			if (x.getDepartment().equalsIgnoreCase("IT")) {
				System.out.println("ID : " + x.getId() + " Name : " + x.getName());
			}
			if (x.getDepartment().equalsIgnoreCase("Admin")) {
				totalEmpOfAdmin++;

			}
			if (x.getCity().equalsIgnoreCase("Pokhara")) {
				totalEmpOfCity++;

			}
			if (x.getDepartment().equalsIgnoreCase("Marketing")) {
				totalSalaryOfDepartment += x.getSalary();
			}
			if (x.getSalary() > maxSalary) {
				maxSalary = x.getSalary();
			}
			if (x.getSalary() < minSalary) {
				minSalary = x.getSalary();
			}

		}
		System.out.println("Total Employee Of Admin Department : " + totalEmpOfAdmin);
		System.out.println("Total Employee Of Pokhara : " + totalEmpOfCity);
		System.out.println("Total Salary of Marketing Department : " + totalSalaryOfDepartment);
		System.out.println("Highest Salary : " + maxSalary);
		System.out.println("Lowest Salary : " + minSalary);

		scn.close();
	}
}
