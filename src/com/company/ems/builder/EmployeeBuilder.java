package com.company.ems.builder;

import com.company.ems.model.Employee;

/**
 * Interface for building different parts of an {@link Employee} object.
 * 
 * <p>The {@code EmployeeBuilder} interface provides methods for setting various
 * attributes of an employee, such as their ID, name, department, role, working hours, and salary.
 * This pattern allows for step-by-step construction of an employee object, enabling flexibility
 * when creating different types of employees (e.g., full-time, part-time, etc.).
 * 
 * <p>Implementing classes should provide specific behavior for constructing
 * employees, and the {@code build()} method should return a fully constructed
 * {@link Employee} object after all required attributes have been set.
 * 
 * <p>This interface is part of the Builder design pattern and is typically used
 * in conjunction with a director class that orchestrates the building process.
 * 
 * @see Employee
 */
public interface EmployeeBuilder {
    
    /**
     * Sets the ID for the employee being built.
     * 
     * @param id the unique identifier for the employee
     */
    void setId(String id);

    /**
     * Sets the name for the employee being built.
     * 
     * @param name the full name of the employee
     */
    void setName(String name);

    /**
     * Sets the department for the employee being built.
     * 
     * @param department the department the employee belongs to
     */
    void setDepartment(String department);

    /**
     * Sets the role for the employee being built.
     * 
     * @param role the role or position the employee will have in the company
     */
    void setRole(String role);

    /**
     * Sets the working hours per week for the employee being built.
     * 
     * @param hours the number of hours the employee will work per week
     */
    void setWorkingHoursPerWeek(int hours);

    /**
     * Sets the salary for the employee being built.
     * 
     * @param salary the salary the employee will receive
     */
    void setSalary(double salary);

    /**
     * Builds and returns the final {@link Employee} object after all required
     * attributes have been set.
     * 
     * @return a fully constructed {@link Employee} object
     */
    Employee build();
}
