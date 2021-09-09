//Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
//он прямоугольным.

package com.company.Branching;

public class Task1 {
    public static void main(String[] args) {
        int angle1 = 32;
        int angle2 = 90;
        int angle3 = 180 - angle1 - angle2;
        boolean triangleExist;
        boolean triangleRight = false;
        triangleExist = angle3 > 0;
        if (triangleExist) {
            triangleRight = angle1 == 90 || angle2 == 90 || angle3 == 90;
        }
        System.out.println("Triangle exists: " + triangleExist + "\nTriangle right: " + triangleRight);
    }
}
