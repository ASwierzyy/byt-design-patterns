package com.project.factory;

public class DataAnalyticsEngine {

    private final IDatabase database;

    public DataAnalyticsEngine(IDatabase database) {
        this.database = database;
    }

    public void processData(String query) {
        database.connect();
        database.executeQuery(query);
    }
}
