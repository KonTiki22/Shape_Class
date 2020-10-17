package com.company;

public class Rectangle extends Sqare {

    public Rectangle(float xcoord, float ycoord, float width, float height) {
        super(xcoord, ycoord, width);
        this.height = height;
    }

    public float calcArea() {
        return width*height;
    }
}
