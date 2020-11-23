package com.company.helper;

import com.company.elements.Circle;
import com.company.elements.Point;

import java.util.ArrayList;
import java.util.Random;

public class RandomHelper {
    Random random = new Random();


    public ArrayList<Point> getRandomPoints() {
        ArrayList<Point> pointArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {

            pointArrayList.add(getRandomPoint());
        }
        return pointArrayList;
    }

    public Point getRandomPoint() {
        int x = random.nextInt(20)- 10;
        int y = random.nextInt(20)- 10;
        return new Point(x, y);
    }

    public Circle getRandomCircle() {
        int radius = random.nextInt(10)+1;
        Point center= getRandomPoint();
        return new Circle(center,radius);
    }

}
