package ru.nosov.task2;

public abstract class Shape {

    protected double volume;

    public Shape(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
}
