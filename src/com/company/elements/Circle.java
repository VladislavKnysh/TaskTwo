package com.company.elements;

public class Circle {
    private final Point CENTER;
    private final int RADIUS;

    public Circle(Point center, int radius) {
        this.RADIUS = radius;
        this.CENTER = center;
    }

    public boolean isPointInCircle(Point point) {

        return Math.sqrt(Math.pow(CENTER.getCoordinateX() - point.getCoordinateX(), 2)
                + Math.pow(CENTER.getCoordinateY() - point.getCoordinateY(), 2.00)) < RADIUS;

    }

    public Point getCENTER() {
        return CENTER;
    }

    public int getRADIUS() {
        return RADIUS;
    }
}
