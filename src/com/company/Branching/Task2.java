//Найти max{min(a, b), min(c, d)}.
package com.company.Branching;

public class Task2 {
    public static void main(String[] args) {
        int a = 8;
        int b = 12;
        int c = 33;
        int d = 2;
        System.out.println(Math.max((Math.min(a, b)), Math.min(c, d)));
    }
}
