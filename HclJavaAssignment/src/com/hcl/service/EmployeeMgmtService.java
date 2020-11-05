package com.hcl.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.hcl.model.Employee;

public class EmployeeMgmtService {
	public List<Employee> findSortedEmaployee(List<Employee> employeeList, String[] empProperties) {
		List<Employee> empList = null;
		Comparator<Employee> comparator = null;
		if ((empProperties != null) && (empProperties.length > 0)) {
			for (int i = 0; i < empProperties.length; i++) {
				if (i == 0) {
					comparator = getComparatorBasedOnProperty(empProperties[i]);
				} else {
					comparator = comparator.thenComparing(getComparatorBasedOnProperty(empProperties[i]));
				}
			}
			empList = employeeList.stream().sorted(comparator).collect(Collectors.toList());
		}
		return empList;
	}

	public Comparator<Employee> getComparatorBasedOnProperty(String property) {
		Comparator<Employee> comp = null;
		if (property.equals("firstName")) {
			comp = Comparator.comparing(Employee::getFirstName);
		} else if (property.equals("lastName")) {
			comp = Comparator.comparing(Employee::getLastName);
		} else if (property.equals("country")) {
			comp = Comparator.comparing(Employee::getCountry);
		} else if (property.equals("age")) {
			comp = Comparator.comparing(Employee::getAge);
		}
		return comp;
	}

}
