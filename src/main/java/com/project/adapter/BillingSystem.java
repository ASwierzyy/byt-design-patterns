package com.project.adapter;

import java.util.List;

public class BillingSystem {

    public void processSalary(List<Employee> listEmployee) {
        for (Employee employee : listEmployee) {
            System.out.println(
                    "Rs." + employee.getSalary()
                            + " Salary Credited to " + employee.getName()
                            + " Account"
            );
        }
    }
}