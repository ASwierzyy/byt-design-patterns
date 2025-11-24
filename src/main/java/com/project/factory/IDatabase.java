package com.project.factory;

public interface IDatabase {
    void connect();
    void executeQuery(String query);
}
