package com.company.ems.test;

import org.junit.jupiter.api.Test;

import com.company.ems.factory.EmployeeFactory;
import com.company.ems.model.Employee;
import com.company.ems.model.FullTimeEmployee;
import com.company.ems.model.PartTimeEmployee;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link EmployeeFactory}.
 * 
 * <p>This class contains unit tests to verify the functionality of the
 * {@link EmployeeFactory}, ensuring that it correctly creates instances of
 * different types of employees (e.g., full-time and part-time).
 * 
 * <p>The tests ensure that the factory pattern is properly implemented by
 * checking that the correct type of employee is returned based on the input.
 * 
 * @see EmployeeFactory
 * @see FullTimeEmployee
 * @see PartTimeEmployee
 */
public class EmployeeFactoryTest {

    /**
     * Test method to verify that the {@link EmployeeFactory} correctly creates a
     * {@link FullTimeEmployee} when the input is "fulltime".
     * 
     * <p>This test checks that the factory creates an employee of the type
     * {@link FullTimeEmployee} when "fulltime" is passed as an argument.
     */
    @Test
    public void testFactoryCreatesFullTimeEmployee() {
        // Create an instance of EmployeeFactory
        EmployeeFactory factory = new EmployeeFactory();
        
        // Use the factory to create a full-time employee
        Employee employee = factory.createEmployee("fulltime");
        
        // Verify that the created employee is an instance of FullTimeEmployee
        assertTrue(employee instanceof FullTimeEmployee);
    }

    /**
     * Test method to verify that the {@link EmployeeFactory} correctly creates a
     * {@link PartTimeEmployee} when the input is "parttime".
     * 
     * <p>This test checks that the factory creates an employee of the type
     * {@link PartTimeEmployee} when "parttime" is passed as an argument.
     */
    @Test
    public void testFactoryCreatesPartTimeEmployee() {
        // Create an instance of EmployeeFactory
        EmployeeFactory factory = new EmployeeFactory();
        
        // Use the factory to create a part-time employee
        Employee employee = factory.createEmployee("parttime");
        
        // Verify that the created employee is an instance of PartTimeEmployee
        assertTrue(employee instanceof PartTimeEmployee);
    }
}
