package com.company.ems.builder;

import com.company.ems.model.Employee;
import com.company.ems.model.PartTimeEmployee;

/**
 * Concrete builder class for constructing part-time employees.
 * 
 * <p>The {@code PartTimeEmployeeBuilder} is responsible for creating and assembling
 * a {@link PartTimeEmployee} object, one attribute at a time, using the builder pattern.
 * This class implements the {@link EmployeeBuilder} interface, defining how each
 * attribute is set for a part-time employee.
 * 
 * <p>Once all the attributes have been set, the {@code build()} method is called 
 * to return the fully constructed {@link PartTimeEmployee}.
 * 
 * @see EmployeeBuilder
 * @see PartTimeEmployee
 */
public class PartTimeEmployeeBuilder implements EmployeeBuilder {
    private PartTimeEmployee employee;

    /**
     * Constructor for {@code PartTimeEmployeeBuilder}.
     * 
     * <p>This constructor initializes a new {@link PartTimeEmployee} instance 
     * that will be built by setting various attributes using the builder methods.
     */
    public PartTimeEmployeeBuilder() {
        employee = new PartTimeEmployee();
    }

    /**
     * Sets the ID of the part-time employee.
     * 
     * @param id the employee ID
     */
    @Override
    public void setId(String id) {
        employee.setId(id);
    }

    /**
     * Sets the name of the part-time employee.
     * 
     * @param name the employee's name
     */
    @Override
    public void setName(String name) {
        employee.setName(name);
    }

    /**
     * Sets the department of the part-time employee.
     * 
     * @param department the department the employee works in
     */
    @Override
    public void setDepartment(String department) {
        employee.setDepartment(department);
    }

    /**
     * Sets the role of the part-time employee.
     * 
     * @param role the employee's role
     */
    @Override
    public void setRole(String role) {
        employee.setRole(role);
    }

    /**
     * Sets the working hours per week for the part-time employee.
     * 
     * @param hours the number of working hours per week
     */
    @Override
    public void setWorkingHoursPerWeek(int hours) {
        employee.setWorkingHoursPerWeek(hours);
    }

    /**
     * Sets the salary of the part-time employee.
     * 
     * @param salary the employee's salary
     */
    @Override
    public void setSalary(double salary) {
        employee.setSalary(salary);
    }

    /**
     * Builds and returns the fully constructed {@link PartTimeEmployee}.
     * 
     * <p>This method returns the part-time employee after all attributes have 
     * been set using the builder methods. The returned object is a complete 
     * {@link PartTimeEmployee} instance ready for use.
     * 
     * @return the fully constructed {@link PartTimeEmployee}
     */
    @Override
    public Employee build() {
        return employee;
    }
}
