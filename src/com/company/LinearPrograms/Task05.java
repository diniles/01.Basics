//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
//данное значение длительности в часах, минутах и секундах в следующей форме:
//ННч ММмин SSc.

package com.company.LinearPrograms;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int timeInSec = scanner.nextInt();
        int timeInSec = 16337;
        int hoursInSec = timeInSec - (timeInSec % 3600);
        int minutesInSec = (timeInSec - hoursInSec) - ((timeInSec - hoursInSec) % 60);
        int seconds = timeInSec - hoursInSec - minutesInSec;
        String hoursStr = hoursInSec / 3600 > 9 ? hoursInSec / 3600 + "h " : "0" + hoursInSec / 3600 + "h ";
        String minutesStr = minutesInSec / 60 > 9 ? minutesInSec / 60 + "m " : "0" + minutesInSec / 60 + "m ";
        String secondsStr = seconds > 9 ? seconds + "s" : "0" + seconds + "s";
        System.out.println(hoursStr + minutesStr + secondsStr);
    }
}
