package com.company.ems.test;

import org.junit.jupiter.api.Test;

import com.company.ems.builder.EmployeeBuilder;
import com.company.ems.builder.EmployeeDirector;
import com.company.ems.builder.FullTimeEmployeeBuilder;
import com.company.ems.model.Employee;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link EmployeeDirector}.
 * 
 * <p>This class contains unit tests to verify the functionality of the
 * {@link EmployeeDirector} class, ensuring that employees are correctly
 * constructed using the provided builder.
 * 
 * <p>The test checks that the {@code construct()} method in
 * {@link EmployeeDirector} properly builds an {@link Employee} object with the
 * specified attributes.
 * 
 * @see EmployeeDirector
 * @see FullTimeEmployeeBuilder
 */
public class EmployeeDirectorTest {

    /**
     * Test method to verify the correct construction of an {@link Employee} object
     * using the {@link EmployeeDirector}.
     * 
     * <p>This test uses the {@link FullTimeEmployeeBuilder} to build a full-time
     * employee. It checks that the name of the constructed employee is correctly
     * set and matches the expected value.
     * 
     * <p>Additional assertions can be added to check other attributes such as ID,
     * department, role, working hours, and salary.
     */
    @Test
    public void testEmployeeConstruction() {
        // Create a FullTimeEmployeeBuilder
        EmployeeBuilder builder = new FullTimeEmployeeBuilder();
        
        // Create an EmployeeDirector to manage the construction process
        EmployeeDirector director = new EmployeeDirector(builder);
        
        // Construct an Employee object with specified attributes
        Employee employee = director.construct("123", "John Doe", "IT", "Developer", 40, 75000);
        
        // Verify that the name of the constructed employee is correct
        assertEquals("John Doe", employee.getName());
    }
}
