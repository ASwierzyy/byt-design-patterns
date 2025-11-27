package com.project.observer;

public class ConcreteObserver implements IObserver {
    private final String userName;

    public ConcreteObserver(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void register(Subject subject) {
        subject.registerObserver(this);
    }

    public void unregister(Subject subject) {
        subject.removeObserver(this);
    }

    @Override
    public void update(String availability) {
        System.out.println("Hello " + userName + ", notification received: product is now " + availability);
    }
}
