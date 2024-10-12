package com.company.ems.builder;

import com.company.ems.model.Employee;

/**
 * Director class to construct employees using the builder pattern.
 * 
 * <p>The {@code EmployeeDirector} is responsible for controlling the 
 * construction process of an {@link Employee} using a specific {@link EmployeeBuilder}.
 * It abstracts the creation process, allowing clients to request employee 
 * construction with defined attributes without needing to know the details of 
 * the building process.
 * 
 * <p>This class encapsulates the building process and delegates it to 
 * different concrete implementations of {@link EmployeeBuilder}.
 * 
 * @see EmployeeBuilder
 * @see Employee
 */
public class EmployeeDirector {
    private EmployeeBuilder builder;

    /**
     * Constructor for {@code EmployeeDirector}.
     * 
     * <p>This constructor initializes the director with a specific 
     * {@link EmployeeBuilder} implementation that will be used to create 
     * an employee.
     * 
     * @param builder the builder instance used to create employees
     */
    public EmployeeDirector(EmployeeBuilder builder) {
        this.builder = builder;
    }

    /**
     * Constructs an employee by setting various attributes.
     * 
     * <p>This method delegates the task of building an employee to the 
     * {@link EmployeeBuilder}. It sets the employee's ID, name, department, 
     * role, working hours per week, and salary. After setting these 
     * attributes, it calls the {@code build()} method on the builder to 
     * return the fully constructed {@link Employee} object.
     * 
     * @param id the employee ID
     * @param name the employee name
     * @param department the department the employee works in
     * @param role the employee's job role
     * @param hours the number of working hours per week
     * @param salary the employee's salary
     * @return the constructed {@link Employee} object
     */
    public Employee construct(String id, String name, String department, String role, int hours, double salary) {
        builder.setId(id);
        builder.setName(name);
        builder.setDepartment(department);
        builder.setRole(role);
        builder.setWorkingHoursPerWeek(hours);
        builder.setSalary(salary);
        return builder.build();
    }
}
