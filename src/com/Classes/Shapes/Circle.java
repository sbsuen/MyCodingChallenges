package com.Classes.Shapes;

public class Circle implements Shape{
    enum Input{
        RADIUS,DIAMETER
    }

    private final double radius;

    public Circle (double input, Input inputType){
        this.radius = inputType.equals((Input.DIAMETER)) ? input/2 : input;
    }

    @Override
    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public double getPerimeter(){
        //Perimeter of a circle is equal to circumference
        return 2 * Math.PI * radius;
    }

    public double getDiameter(){
        return radius*2;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + getRadius() +
                ", diameter=" + getDiameter() +
                ", Circumference=" + getPerimeter() +
                ", Area=" + getArea() +
                '}';
    }
}
