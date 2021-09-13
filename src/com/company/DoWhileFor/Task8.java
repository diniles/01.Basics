//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа
package com.company.DoWhileFor;

public class Task8 {
    public static void main(String[] args) {
        int a = 124566;
        int b = 678562;
        int[] arr = new int[10];
        while (a != 0) {
            arr[a % 10]++;
            a /= 10;
        }
        while (b != 0) {
            if (arr[b % 10] != 0)
                System.out.println(b % 10);
            b /= 10;
        }
    }
}


