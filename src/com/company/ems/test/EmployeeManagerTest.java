package com.company.ems.test;

import org.junit.jupiter.api.Test;

import com.company.ems.manager.EmployeeManager;
import com.company.ems.model.Employee;
import com.company.ems.model.FullTimeEmployee;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link EmployeeManager}.
 * 
 * <p>This class contains unit tests to verify the functionality of the 
 * {@link EmployeeManager} class, specifically testing its Singleton behavior 
 * and the ability to add and retrieve employees.
 * 
 * <p>The tests ensure that only one instance of {@link EmployeeManager} is 
 * created (Singleton pattern) and that employees can be properly managed.
 * 
 * @see EmployeeManager
 * @see FullTimeEmployee
 */
public class EmployeeManagerTest {

    /**
     * Test method to verify Singleton behavior in {@link EmployeeManager}.
     * 
     * <p>This test ensures that only one instance of {@link EmployeeManager} 
     * is created, and that multiple calls to {@code getInstance()} return the 
     * same object.
     * 
     * <p>It uses the {@code assertSame} method to check that two calls to 
     * {@code EmployeeManager.getInstance()} return the same reference.
     */
    @Test
    public void testSingletonBehavior() {
        // Get the first instance of EmployeeManager
        EmployeeManager manager1 = EmployeeManager.getInstance();
        
        // Get the second instance of EmployeeManager
        EmployeeManager manager2 = EmployeeManager.getInstance();
        
        // Ensure both references point to the same instance
        assertSame(manager1, manager2);
    }

    /**
     * Test method to verify that an employee can be added to the 
     * {@link EmployeeManager} and then retrieved.
     * 
     * <p>This test ensures that an employee can be added to the 
     * {@link EmployeeManager} and successfully retrieved by their ID.
     * 
     * <p>It creates a new {@link FullTimeEmployee}, assigns it an ID, adds 
     * it to the manager, and verifies that the employee is successfully 
     * retrieved using the {@code getEmployee()} method.
     */
    @Test
    public void testAddAndRetrieveEmployee() {
        // Get the singleton instance of EmployeeManager
        EmployeeManager manager = EmployeeManager.getInstance();
        
        // Create a new FullTimeEmployee and set the ID
        Employee employee = new FullTimeEmployee();
        employee.setId("123");
        
        // Add the employee to the manager
        manager.addEmployee(employee);
        
        // Verify that the employee is not null when retrieved by ID
        assertNotNull(manager.getEmployee("123"));
    }
}
