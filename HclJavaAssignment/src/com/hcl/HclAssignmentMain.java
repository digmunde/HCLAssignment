package com.hcl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hcl.model.Candidate;
import com.hcl.model.Employee;
import com.hcl.service.ElectionService;
import com.hcl.service.EmployeeMgmtService;
import com.hcl.service.EquationService;

public class HclAssignmentMain {

	static List<Candidate> candidateList = new ArrayList<Candidate>();
	static List<Employee> employeeList = new ArrayList<Employee>();
	// Problem 3 input
	static String[] empProperties = { "firstName", "lastName", "country", "age" };
	static {
		// Problem 1 input
		Candidate c1 = new Candidate("Ajay", "Atre", LocalDate.parse("1970-07-07"), 20000, "Kharadi");
		Candidate c2 = new Candidate("Ajay", "Atre", LocalDate.parse("1970-08-11"), 20000, "Kharadi");
		Candidate c3 = new Candidate("Ajay", "Pant", LocalDate.parse("1970-09-07"), 20000, "Kharadi");
		Candidate c4 = new Candidate("Binay", "Atre", LocalDate.parse("1970-01-07"), 40000, "Kharadi");
		Candidate c5 = new Candidate("Binay", "Atre", LocalDate.parse("1970-07-07"), 40000, "Kharadi");
		candidateList.add(c1);
		candidateList.add(c2);
		candidateList.add(c3);
		candidateList.add(c4);
		candidateList.add(c5);

		// Problem 3 input
		Employee e1 = new Employee("Binay", "Atre", "India", 35);
		Employee e2 = new Employee("Ajay", "Atre", "India", 35);
		Employee e3 = new Employee("Ajay", "Atre", "US", 35);
		Employee e4 = new Employee("Ajay", "Atre", "India", 40);
		Employee e5 = new Employee("Ajay", "Pant", "India", 35);
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.println("Enter the Problem No (values allowed are 1/2/3) :: ");

				String inputStr = scanner.nextLine();
				if (inputStr.trim().equals("1")) {
					ElectionService service = new ElectionService();
					Candidate winner = service.findWinner(candidateList);
					System.out.println("The winner is " + winner.getFirstName() + " " + winner.getLastName() + " "
							+ winner.getNoOfVotes() + " " + winner.getDob());
					System.out.println("From following candidates :: ");
					for(Candidate candidate : candidateList)
					{
						System.out.println(candidate);
					}
					System.out.println();
				} else if (inputStr.trim().equals("2")) {
					EquationService equationService = new EquationService();
					equationService.evaluateEquation(1, 5);
				} else if (inputStr.trim().equals("3")) {
					EmployeeMgmtService employeeMgmtService = new EmployeeMgmtService();
					System.out.println("Employee List before sorting");
					System.out.println(employeeList);
					List<Employee> empList = employeeMgmtService.findSortedEmaployee(employeeList, empProperties);
					System.out.println("The sorted list is ");
					for (Employee employee : empList) {
						System.out.println(employee);
					}
				} 
			}

		}

	}

}
