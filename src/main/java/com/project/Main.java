package com.project;

import com.project.adapter.EmployeeAdapter;
import com.project.adapter.ITarget;
import com.project.factory.DataAnalyticsEngine;
import com.project.factory.DatabaseFactory;
import com.project.factory.DatabaseType;
import com.project.factory.IDatabase;
import com.project.observer.ConcreteObserver;
import com.project.observer.Subject;

public class Main {
    public static void main(String[] args) {
    // Factory
        IDatabase db = DatabaseFactory.createDatabase(DatabaseType.Oracle);
        DataAnalyticsEngine engine = new DataAnalyticsEngine(db);
        engine.processData("SELECT * FROM SALES");
    // Observer
        Subject phone = new Subject("iPhone 16", 999, "Out of Stock");
        ConcreteObserver adam = new ConcreteObserver("Adam");
        ConcreteObserver kate = new ConcreteObserver("Kate");
        adam.register(phone);
        kate.register(phone);
        phone.setAvailability("Available");
        kate.unregister(phone);
    // Adapter
        String[][] employeesArray = {
                {"101", "Adam", "Software Engineer", "75000"},
                {"102", "Kate", "Product Manager", "90000"},
                {"103", "John", "Tester", "55000"}
        };
        ITarget employeeAdapter = new EmployeeAdapter();
        employeeAdapter.processCompanySalary(employeesArray);
    }
}