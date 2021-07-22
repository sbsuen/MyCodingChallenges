package com.Classes.Shapes;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter(){
        //Perimeter of a circle is equal to circumference
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
