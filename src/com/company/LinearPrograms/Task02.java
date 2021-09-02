//Вычислить значение выражения по формуле (все переменные принимают действительные значения):
//((𝑏 + √(𝑏2 + 4𝑎𝑐)) / 2𝑎) − 𝑎3𝑐 + 𝑏−2
package com.company.LinearPrograms;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double firstPart = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a;
        double secondPart = Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println(firstPart - secondPart);
    }

}
