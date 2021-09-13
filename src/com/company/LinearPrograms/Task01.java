//Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
package com.company.LinearPrograms;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(((a - 3) * b / 2) + c);
        scanner.close();
    }
}
