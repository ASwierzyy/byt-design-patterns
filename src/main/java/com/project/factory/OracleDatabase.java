package com.project.factory;

public class OracleDatabase implements IDatabase {

    @Override
    public void connect() {
        System.out.println("Connecting to Oracle database...");
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("Executing query in Oracle database: " + query);
    }
}
