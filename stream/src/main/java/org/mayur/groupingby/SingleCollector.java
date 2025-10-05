package org.mayur.groupingby;

import org.mayur.data.Employee;
import org.mayur.data.MockEmployee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SingleCollector {

    public static void main(String[] args) {
        List<Employee> employeeList = MockEmployee.getAllEmployees();

        employeeList.stream()
                .filter(emp->emp.getSalary()>90000)
                .forEach(System.out::println);


Map<String, List<Employee>> mapByEmpId = employeeList.stream().collect(Collectors.groupingBy(Employee::getEmployeeId));

        mapByEmpId.forEach((empId, empList) -> {
            System.out.println("Employee ID: " + empId);
            empList.forEach(System.out::println);
            System.out.println();
        });


    }

}
