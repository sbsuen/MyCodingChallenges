package com.Classes.Shapes;

public class Triangle implements Shape{
    private double base;
    private double sideOne;
    private double sideTwo;

    public Triangle(double base, double sideOne, double sideTwo) {
        this.base = base;
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    public double getPerimeter() {
        return base + sideOne + sideTwo;
    }

    @Override
    public double getArea() {
        return (base * getHeight()) / 2;
    }

    public double getHeight(){
        return 1.0;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getSideOne() {
        return sideOne;
    }

    public void setSideOne(double sideOne) {
        this.sideOne = sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(double sideTwo) {
        this.sideTwo = sideTwo;
    }
}
