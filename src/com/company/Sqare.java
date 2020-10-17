package com.company;

public class Sqare {
    protected float x;
    protected float y;
    protected float width;
    protected float height;


    public Sqare(float xcoord, float ycoord, float side) {
        x = xcoord;
        y = ycoord;
        width = side;
        height = side;
    }
    public float calcDiagonal() {
        return (float) Math.sqrt(Math.pow(width,2)+Math.pow(height,2));
    }
}
