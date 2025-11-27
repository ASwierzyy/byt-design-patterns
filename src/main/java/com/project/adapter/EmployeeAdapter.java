package com.project.adapter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EmployeeAdapter implements ITarget {

    private final BillingSystem thirdPartyBillingSystem = new BillingSystem();

    @Override
    public void processCompanySalary(String[][] employeesArray) {
        List<Employee> employees = new ArrayList<>();

        for (String[] row : employeesArray) {
            int id = Integer.parseInt(row[0]);
            String name = row[1];
            String designation = row[2];
            double salary = Double.parseDouble(row[3]);

            employees.add(new Employee(id, name, designation, salary));
        }

        thirdPartyBillingSystem.processSalary(employees);
    }
}