//Вычислить значение функции:
//see task5.png

package com.company.Branching;

public class Task5 {
    public static void main(String[] args) {
        double x = 4;
        double result;
        if (x <= 3) {
            result = (Math.pow(x, 2) - 3 * x + 9);
        } else {
            result = 1 / (x * x + 6);
        }
        System.out.println(result);
    }
}
