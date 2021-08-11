package com.Classes.Shapes;

public class Square extends Rectangle implements Shape{
    private final double side;

    public Square(double side){
        super(side, side);
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", Perimeter=" + getPerimeter() +
                ", Area=" + getArea() +
                '}';
    }
}
