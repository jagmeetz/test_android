package com.example.test_android;

// Create a class called Shape and calculate area using inheritance and polymporphism concepts we learned
// to calculate the area of Square, Rectangle and Triangle


public class Shape {
    float firstSide;
    float secondSide;

    Shape(float firstSide, float secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public String toString() {
        return Float.toString(firstSide * secondSide);
    }
}

class Square extends Shape {
    Square(float side) {
        super(side, side);
    }

    public String toString() {
        return "Square Area:" + super.toString();
    }
}

class Rectangle extends Shape {
    Rectangle(float side1, float side2) {
        super(side1, side2);
    }

    public String toString() {
        return "Rectangle Area:" + super.toString();
    }
}


class Triangle extends Shape {
    Triangle(float base, float height) {
        super(base / 2, height);
    }

    public String toString() {
        return "Triangle Area:" + super.toString();
    }
}
