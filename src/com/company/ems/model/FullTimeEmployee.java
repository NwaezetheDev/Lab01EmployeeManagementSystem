package com.company.ems.model;

/**
 * Full-time employee class.
 */
public class FullTimeEmployee extends Employee {

    @Override
    public void clockIn() {
        System.out.println(name + " (Full-time) clocked in.");
    }

    @Override
    public void clockOut() {
        System.out.println(name + " (Full-time) clocked out.");
    }

    @Override
    public void trackWorkHours() {
        System.out.println(name + " is tracking full-time hours.");
    }
}

