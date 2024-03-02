package com.nc.service;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;
import com.nc.empdb.EmployeeDB;
import com.nc.entity.Employee;

/**
 * @author Shad Ahmad
 * @since 27/02/2024
 */

public class EmployeeService {
	
	public static List<Employee> employeeList = EmployeeDB.getEmployeeData();
	
	public static void main(String a[]) {
		
	//1. Get all the employee names from the employee list - use of map
		
	List<String> employeeName =employeeList.stream().map(employee->employee.getName())
					.collect(Collectors.toList());	
	System.out.println(employeeName);
	
	//2. Sort the employee list based on age - use of sorted
	
	List<Employee> sortedEmplListByAge = employeeList.stream().sorted(Comparator.comparing(Employee::getAge))
				.collect(Collectors.toList());	
	System.out.println(sortedEmplListByAge);
	
	//3. Get all the phone no from the employee list (where phone is another list) - how to extract a list from list of list - flatmap
	
	List<String> employeePhoneList =  employeeList.stream().flatMap(employee->employee.getPhone().stream())
	.collect(Collectors.toList());
	System.out.println(employeePhoneList);
	
	//4. Group all the employee based on their department
	
	Map<String, List<Employee>> collectByDept = employeeList.stream().collect(Collectors.groupingBy(m->m.getDept()));	
	System.out.println(collectByDept);
	
	//5. Group all the employee based on their department and give count as result
	
	Map<String, Long> collectCountDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));
	System.out.println(collectCountDept);
	
	//6. Get maximum employee group
	
	Entry<String, Long> maxDept = employeeList.stream().
			collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()))
	          .entrySet().stream().max(Map.Entry.comparingByValue()).get();
	System.out.println(maxDept);
	
	//7. based on the dept avg salary
	
	Map<String, Double> collectAvgGroup = employeeList.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(collectAvgGroup);
	
	//8. based on the dept max salary
		
		Map<String, Optional<Employee>> collectMaxSalGroup = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDept, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
			System.out.println(collectMaxSalGroup);
	//9. Get the Second Highest salaried employee details in each dept.
		HashMap<String, Employee> map = new HashMap<>();
			collectByDept.entrySet().stream().forEach(m->{
		Optional<Employee> emp = 		m.getValue().stream().sorted(Comparator.comparing(Employee::getSalary)).skip(1).findFirst();
		if(emp.isPresent())
				 map.put(m.getKey(), emp.get());
		else
			map.put(m.getKey(), m.getValue().stream().sorted(Comparator.comparing(Employee::getSalary)).findAny().get());
			});
			System.out.println(map);
	
			//10. Filter the employee for each department has salary>3000000
			
			Map<String, List<Employee>> collectEmpBYSalGrp = employeeList.stream().filter(m->m.getSalary()>3000000).collect(Collectors.groupingBy(Employee::getDept));
			System.out.println(collectEmpBYSalGrp);
			
			//11. What is the total salary paid to all employees
			
			double totalSal =  employeeList.stream().map(m->m.getSalary()).reduce(0.0, Double::sum);
			System.out.println(String.format("%.1f", totalSal));
			
	}

}
