package ru.nosov.task1;

public class Client extends Human{
    public String bankName;

    @Override
    public void printInfo() {
        System.out.println("Name: " + super.name + " Surname: " + super.surName);
    }

    public Client(String name, String surName, String bankName) {
        super(name, surName);
        this.bankName = bankName;
    }
}
