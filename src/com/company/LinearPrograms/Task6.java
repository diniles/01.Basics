//Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
//принадлежит закрашенной области, и false — в противном случае:
//x:-4,y:-3 :: x:4, y:-3
//x:-2,y:4 :: x:2, y:4

package com.company.LinearPrograms;

public class Task6 {
    public static void main(String[] args) {
        boolean result = false;
        int pointX = 0;
        int pointY = -1;
        if (pointX >= -4 && pointX <= 4 && pointY >= -3 && pointY <= 0) {
            result = true;
        } else if (pointX >= -2 && pointX <= 2 && pointY >= 0 && pointY <= 4) {
            result = true;
        }
        System.out.println(result);
    }
}
