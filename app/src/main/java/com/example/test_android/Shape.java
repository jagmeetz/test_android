package com.example.test_android;

// Create a class called Shape and calculate area using inheritance and polymporphism concepts we learned
// to calculate the area of Square, Rectangle and Triangle
public class Shape {

}

class Area_calculator {
    float firstSide;
    float secondSide;

    Area_calculator(float firstSide, float secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public String toString() {
        return Float.toString(firstSide * secondSide);
    }
}

class Square extends Area_calculator {
    Square(float side) {
        super(side, side);
    }

    public String toString() {
        return "Square Area:" + super.toString();
    }
}

class Rectangle extends Area_calculator {
    Rectangle(float side1, float side2) {
        super(side1, side2);
    }

    public String toString() {
        return "Rectangle Area:" + super.toString();
    }
}


class Triangle extends Area_calculator {
    Triangle(float base, float height) {
        super(base / 2, height);
    }

    public String toString() {
        return "Triangle Area:" + super.toString();
    }
}
