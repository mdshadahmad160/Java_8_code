package com.nc.empdb;

import java.util.Arrays;
import java.util.List;

import com.nc.entity.Address;
import com.nc.entity.Employee;

public class EmployeeDB {

	public static List<Employee> getEmployeeData(){
		
		List<Employee> employeeList =Arrays.asList(
			new Employee(100, "John", 45, 4500000, "IT-VP", new Address("Pheonix", "Pennsylvania"), Arrays.asList("9111111111","8111111111")),
			new Employee(101, "Jorge", 35, 3500000, "IT-AVP", new Address("Virginia", "New York"), Arrays.asList("8545651123","4512325565")),
			new Employee(102, "Elijah", 40, 2500000, "IT-Software", new Address("Chicago", "Houston"), Arrays.asList("2132455556","4212333333")),
			new Employee(103, "Michael", 45, 1500000, "IT-Engg", new Address("Virginia", "New York"), Arrays.asList("4522222222","4444555512")),
			new Employee(104, "Alex", 20, 2300000, "IT-Support", new Address("Chicago", "Houston"), Arrays.asList("1122554485","4422558825")),
			new Employee(105, "Charles", 25, 4530000, "IT-AVP", new Address("Pheonix", "Pennsylvania"), Arrays.asList("4565125555","6655221123")),
			new Employee(106, "Henry", 35, 4500000, "IT-Software", new Address("Pheonix", "Pennsylvania"), Arrays.asList("4488996655","1122332258")),
			new Employee(107, "Lucas", 45, 1300000, "IT-Engg", new Address("Chicago", "Houston"), Arrays.asList("4565452232","1254896656")),
			new Employee(108, "William", 35, 2300000, "IT-Engg", new Address("Pheonix", "Pennsylvania"), Arrays.asList("1255448895","4565985236")),
			new Employee(109, "Liam", 48, 3300000, "IT-AVP", new Address("Pheonix", "Pennsylvania"), Arrays.asList("4521225595","4555444444")),
			new Employee(110, "Oliver", 42, 3200000, "IT-Engg", new Address("Virginia", "New York"), Arrays.asList("8788956523","2155854456")));
				
		return employeeList;
	}
	
}
