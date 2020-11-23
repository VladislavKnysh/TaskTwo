package com.company;

import com.company.elements.Point;
import com.company.elements.UserInfo;

public class UsersInfoChecker {
    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo();
        userInfo.getRandomInfo();
        displayPointStatus(userInfo);
    }

    public static void displayPointStatus(UserInfo userInfo) {
        int index = 0;
        System.out.println("Your circle: ");
        System.out.println("R= " + userInfo.getUsersCircle().getRADIUS());
        System.out.println("Center(" + userInfo.getUsersCircle().getCENTER().getCoordinateX() + ";" +
                "" + userInfo.getUsersCircle().getCENTER().getCoordinateY() + ")");
        for (Point point : userInfo.getPointArrayList()) {
            index++;
            if (userInfo.getUsersCircle().isPointInCircle(point)) {
                System.out.println("Point#" + index +
                        "(" + point.getCoordinateX() + ";" + point.getCoordinateY() + ") is in circle.");

            } else {
                System.out.println("Point#" + index +
                        "(" + point.getCoordinateX() + ";" + point.getCoordinateY() + ") is situated outside of a circle.");
            }
        }
    }
}
