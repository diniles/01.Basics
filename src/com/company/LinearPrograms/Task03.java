//Вычислить значение выражения по формуле (все переменные принимают действительные значения):
//        ((𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦) / (𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦)) ∗ 𝑡𝑔 𝑥𝑦
package com.company.LinearPrograms;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        System.out.println((Math.sin(x) + Math.cos(y) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y));
        scanner.close();
    }
}
