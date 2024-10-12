package com.company.ems.factory;

import com.company.ems.model.Employee;
import com.company.ems.model.FullTimeEmployee;
import com.company.ems.model.PartTimeEmployee;

/**
 * Factory class to create different types of employees.
 */
public class EmployeeFactory {

    /**
     * Create an employee based on the provided type.
     *
     * @param employeeType the type of employee
     * @return the created Employee object
     */
    public Employee createEmployee(String employeeType) {
        switch (employeeType.toLowerCase()) {
            case "fulltime":
                return new FullTimeEmployee();
            case "parttime":
                return new PartTimeEmployee();
            default:
                throw new IllegalArgumentException("Unknown employee type");
        }
    }
}

