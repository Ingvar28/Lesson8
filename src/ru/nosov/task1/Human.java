package ru.nosov.task1;

abstract class Human {
    protected String name, surName;

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public abstract void printInfo ();

    public Human(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }
}
