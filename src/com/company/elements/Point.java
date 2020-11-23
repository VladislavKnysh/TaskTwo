package com.company.elements;

public class Point {
    private final int COORDINATE_X;


    private final int COORDINATE_Y;



    public Point(int x, int y) {
        this.COORDINATE_X = x;
        this.COORDINATE_Y = y;
    }

    public int getCoordinateX() {
        return COORDINATE_X;
    }

    public int getCoordinateY() {
        return COORDINATE_Y;
    }


}
