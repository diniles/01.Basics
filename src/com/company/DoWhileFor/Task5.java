//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,модуль которых больше или равен
//заданному е.Общий член ряда имеет вид: a(n)=(1/pow(2,n)+(1/pow(3,n)))

package com.company.DoWhileFor;

public class Task5 {
    public static void main(String[] args) {
        double start = 2.0;
        double end = 12.0;
        double e = 0.123;
        double sum = 0.0;
        for (double i = start; i <= end; i++) {
            double result = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));
            if (Math.abs(result) >= Math.abs(e)) {
                sum += result;
            }
        }
        System.out.println(sum);
    }
}
