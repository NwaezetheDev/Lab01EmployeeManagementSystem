package com.company.ems;

import com.company.ems.builder.EmployeeBuilder;
import com.company.ems.builder.EmployeeDirector;
import com.company.ems.builder.FullTimeEmployeeBuilder;
import com.company.ems.builder.PartTimeEmployeeBuilder;
import com.company.ems.factory.EmployeeFactory;
import com.company.ems.manager.EmployeeManager;
import com.company.ems.model.Employee;

/*
 * Student Name: Michael Nwaeze
 * Student Number: 041129857
 * Professor: Professor Reg Dyer
 * Due Date: 11th October 2024
 * Description: Lab 1 (24F) Solution
 */

/**
 * Main class to simulate the Employee Management System (EMS).
 * 
 * <p>This class demonstrates the use of various design patterns in the EMS, 
 * such as Singleton, Factory, and Builder patterns, to manage employee creation, 
 * construction, and management.
 * 
 * <p>The system simulates adding employees to the employee manager, constructing 
 * employees using the builder pattern, and tracking employee work activities 
 * (clocking in, clocking out, and tracking work hours).
 * 
 * <p>The patterns used include:
 * <ul>
 *     <li><b>Singleton:</b> {@link EmployeeManager} ensures only one instance of the manager exists.</li>
 *     <li><b>Factory:</b> {@link EmployeeFactory} creates employees based on type (full-time, part-time).</li>
 *     <li><b>Builder:</b> {@link EmployeeDirector} constructs employees with specified attributes.</li>
 * </ul>
 */
public class EMS {

    /**
     * The main method to simulate the Employee Management System.
     * 
     * <p>This method demonstrates the following steps:
     * <ol>
     *     <li>Creates a singleton instance of {@link EmployeeManager} to manage employees.</li>
     *     <li>Uses the {@link EmployeeFactory} to create full-time and part-time employees.</li>
     *     <li>Uses the {@link EmployeeDirector} and builder pattern to construct full-time and part-time employees 
     *     with specific attributes such as ID, name, department, role, working hours, and salary.</li>
     *     <li>Adds the constructed employees to the manager for tracking.</li>
     *     <li>Simulates employees clocking in, tracking work hours, and clocking out.</li>
     * </ol>
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Singleton: Employee Manager
        EmployeeManager manager = EmployeeManager.getInstance();

        // Factory: Creating employees
        EmployeeFactory factory = new EmployeeFactory();
        Employee fullTimeEmployee = factory.createEmployee("fulltime");
        Employee partTimeEmployee = factory.createEmployee("parttime");

        // Builder: Constructing employees
        EmployeeDirector director;
        EmployeeBuilder fullTimeBuilder = new FullTimeEmployeeBuilder();
        director = new EmployeeDirector(fullTimeBuilder);
        fullTimeEmployee = director.construct("001", "Michael Nwaeze", "IT", "Developer", 40, 75000); 

        EmployeeBuilder partTimeBuilder = new PartTimeEmployeeBuilder();
        director = new EmployeeDirector(partTimeBuilder);
        partTimeEmployee = director.construct("002", "Lionel Messi", "HR", "Recruiter", 20, 30000);

        // Add employees to the manager
        manager.addEmployee(fullTimeEmployee);
        manager.addEmployee(partTimeEmployee);

        // Simulate employee clock-in, clock-out and track work hours
        fullTimeEmployee.clockIn();
        fullTimeEmployee.trackWorkHours();
        fullTimeEmployee.clockOut();
        
        // Space between the outputs
        System.out.println();

        partTimeEmployee.clockIn();
        partTimeEmployee.trackWorkHours();
        partTimeEmployee.clockOut();
    }
}
