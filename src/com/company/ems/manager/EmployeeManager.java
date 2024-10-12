package com.company.ems.manager;

import java.util.HashMap;

import com.company.ems.model.Employee;

/**
 * Singleton class that manages employees in the system.
 */
public class EmployeeManager {
    private static EmployeeManager instance = null;
    private HashMap<String, Employee> employees;

    /**
     * Private constructor to prevent instantiation.
     */
    private EmployeeManager() {
        employees = new HashMap<>();
    }

    /**
     * Returns the single instance of EmployeeManager.
     *
     * @return the EmployeeManager instance
     */
    public static EmployeeManager getInstance() {
        if (instance == null) {
            instance = new EmployeeManager();
        }
        return instance;
    }

    /**
     * Add an employee to the system.
     *
     * @param employee the employee to be added
     */
    public void addEmployee(Employee employee) {
        employees.put(employee.getId(), employee);
    }

    /**
     * Remove an employee from the system by ID.
     *
     * @param id the employee ID
     */
    public void removeEmployee(String id) {
        employees.remove(id);
    }

    /**
     * Retrieve an employee by ID.
     *
     * @param id the employee ID
     * @return the Employee object
     */
    public Employee getEmployee(String id) {
        return employees.get(id);
    }
}

