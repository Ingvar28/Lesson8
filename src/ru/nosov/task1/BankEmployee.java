package ru.nosov.task1;

public class BankEmployee extends Human {
    public String bankName;

    @Override
    public void printInfo() {

    }

    public BankEmployee(String name, String surName, String bankName) {
        super(name, surName);
        this.bankName = bankName;
    }
}
