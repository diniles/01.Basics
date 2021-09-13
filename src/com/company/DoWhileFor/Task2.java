//Вычислить значения функции на отрезке [а,b] c шагом h:
package com.company.DoWhileFor;

public class Task2 {
    public static void main(String[] args) {
        int a = -7;
        int b = 12;
        int h = 3;
        for (int i = a; i <= b; i = i + h) {
            if (i <= 2) {
                System.out.println("x= " + " " + i + " y= " + -i);
            } else {
                System.out.println("x= " + " " + i + " y= " + i);
            }
        }
    }
}
