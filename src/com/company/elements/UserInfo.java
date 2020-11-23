package com.company.elements;

import com.company.helper.RandomHelper;

import java.util.ArrayList;

public class UserInfo {
    private ArrayList<Point> pointArrayList;
    private Circle usersCircle;

    public UserInfo() {
    }

    public UserInfo(ArrayList<Point> pointArrayList, Circle usersCircle) {
        this.usersCircle = usersCircle;
        this.pointArrayList = pointArrayList;
    }

    public void getRandomInfo() {
        RandomHelper randomHelper = new RandomHelper();
        pointArrayList = randomHelper.getRandomPoints();
        usersCircle = randomHelper.getRandomCircle();
    }

    public ArrayList<Point> getPointArrayList() {
        return pointArrayList;
    }

    public void setPointArrayList(ArrayList<Point> pointArrayList) {
        this.pointArrayList = pointArrayList;
    }

    public Circle getUsersCircle() {
        return usersCircle;
    }

    public void setUsersCircle(Circle usersCircle) {
        this.usersCircle = usersCircle;
    }
}
