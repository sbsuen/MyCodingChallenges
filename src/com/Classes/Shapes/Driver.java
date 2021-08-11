package com.Classes.Shapes;

public class Driver {
    public static void main(String[] args) {
        Circle circle = new Circle(10, Circle.Input.DIAMETER);
        Square square = new Square(5);
        Triangle triangle = new Triangle(6,6,6);
        Rectangle rectangle = new Rectangle(15,17);
        System.out.println(circle);
        System.out.println(square);
        System.out.println(triangle);
        System.out.println(rectangle);
    }
}
