//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
//отверстие
package com.company.Branching;

public class Task4 {
    public static void main(String[] args) {
        int holeSizeA = 8;
        int holeSizeB = 4;
        int brickSizeX = 12;
        int brickSizeY = 7;
        int brickSizeZ = 9;
        boolean sizeA = holeSizeA > brickSizeX || holeSizeA > brickSizeY || holeSizeA > brickSizeZ;
        boolean sizeB = holeSizeB > brickSizeX || holeSizeB > brickSizeY || holeSizeB > brickSizeZ;
        System.out.println(sizeA && sizeB);
    }
}
