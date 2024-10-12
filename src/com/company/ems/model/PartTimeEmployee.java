package com.company.ems.model;

/**
 * Part-time employee class.
 */
public class PartTimeEmployee extends Employee {

    @Override
    public void clockIn() {
        System.out.println(name + " (Part-time) clocked in.");
    }

    @Override
    public void clockOut() {
        System.out.println(name + " (Part-time) clocked out.");
    }

    @Override
    public void trackWorkHours() {
        System.out.println(name + " is tracking part-time hours.");
    }
}


