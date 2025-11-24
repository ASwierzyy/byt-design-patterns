package com.project.factory;

public class SqlServerDatabase implements IDatabase {

    @Override
    public void connect() {
        System.out.println("Connecting to SQL Server database...");
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("Executing query in SQL Server database: " + query);
    }
}
