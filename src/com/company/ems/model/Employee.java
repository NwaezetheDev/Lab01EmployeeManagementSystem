package com.company.ems.model;

/**
 * Abstract class representing a generic employee in the Employee Management System (EMS).
 * This class provides the common attributes and methods that are shared by all types of employees.
 * 
 * <p>Subclasses of {@code Employee} must implement the following abstract methods:
 * <ul>
 *   <li>{@link #clockIn()} - to record when the employee starts working.</li>
 *   <li>{@link #clockOut()} - to record when the employee finishes working.</li>
 *   <li>{@link #trackWorkHours()} - to track the total hours worked by the employee.</li>
 * </ul>
 * 
 * <p>It contains attributes like:
 * <ul>
 *   <li>{@code id} - the unique identifier for the employee.</li>
 *   <li>{@code name} - the full name of the employee.</li>
 *   <li>{@code department} - the department the employee belongs to.</li>
 *   <li>{@code role} - the role or position of the employee within the company.</li>
 *   <li>{@code workingHoursPerWeek} - the number of hours the employee works per week.</li>
 *   <li>{@code salary} - the salary of the employee.</li>
 * </ul>
 * 
 * <p>Getter and setter methods are provided for all properties, allowing subclasses and
 * external classes to retrieve and modify the state of an employee.
 * 
 * @author Michael Nwaeze
 * @version 1.0
 */
public abstract class Employee {
    /**
     * The unique identifier for the employee.
     */
    protected String id;

    /**
     * The name of the employee.
     */
    protected String name;

    /**
     * The department the employee belongs to.
     */
    protected String department;

    /**
     * The role or job position of the employee.
     */
    protected String role;

    /**
     * The number of working hours per week.
     */
    protected int workingHoursPerWeek;

    /**
     * The salary of the employee.
     */
    protected double salary;

    /**
     * Clock in the employee. This method should be implemented by subclasses to 
     * specify how the employee clocks in to start their work.
     */
    public abstract void clockIn();

    /**
     * Clock out the employee. This method should be implemented by subclasses to 
     * specify how the employee clocks out after completing their work.
     */
    public abstract void clockOut();

    /**
     * Track the work hours of the employee. This method should be implemented by
     * subclasses to specify how the system tracks the number of hours worked by the employee.
     */
    public abstract void trackWorkHours();

    /**
     * Retrieves the unique identifier of the employee.
     * 
     * @return the employee's ID
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the unique identifier for the employee.
     * 
     * @param id the new ID to be assigned to the employee
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Retrieves the name of the employee.
     * 
     * @return the employee's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the employee.
     * 
     * @param name the new name to be assigned to the employee
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the department of the employee.
     * 
     * @return the employee's department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the department of the employee.
     * 
     * @param department the new department to be assigned to the employee
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Retrieves the role of the employee.
     * 
     * @return the employee's role
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the role of the employee.
     * 
     * @param role the new role to be assigned to the employee
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Retrieves the number of working hours per week for the employee.
     * 
     * @return the number of hours the employee works per week
     */
    public int getWorkingHoursPerWeek() {
        return workingHoursPerWeek;
    }

    /**
     * Sets the number of working hours per week for the employee.
     * 
     * @param workingHoursPerWeek the new number of hours to be assigned to the employee
     */
    public void setWorkingHoursPerWeek(int workingHoursPerWeek) {
        this.workingHoursPerWeek = workingHoursPerWeek;
    }

    /**
     * Retrieves the salary of the employee.
     * 
     * @return the employee's salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets the salary of the employee.
     * 
     * @param salary the new salary to be assigned to the employee
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
