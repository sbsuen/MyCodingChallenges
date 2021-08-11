package com.Classes.Shapes;

public class Triangle implements Shape{
    //Sides
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

    /*
    * Returns the area of the triangle based on Heron's formula
    * */
    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s-base) * (s-sideOne) * (s-sideTwo));
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

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", sideOne=" + sideOne +
                ", sideTwo=" + sideTwo +
                ", Perimeter=" + getPerimeter() +
                ", Area=" + getArea() +
                '}';
    }
}
