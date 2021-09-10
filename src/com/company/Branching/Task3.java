//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
package com.company.Branching;

public class Task3 {
    public static void main(String[] args) {
        int ax1 = 1;
        int ay1 = 1;
        int ax2 = 3;
        int ay2 = 2;
        int ax3 = 3;
        int ay3 = 3;

        System.out.println((ax3 * (ay2 - ay1) - ay3 * (ax2 - ax1) == ax1 * ay2 - ax2 * ay1));

    }
}
