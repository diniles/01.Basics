//Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
//Поменять местами дробную и целую части числа и вывести полученное значение числа.
package com.company.LinearPrograms;

public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number = 789.543;
		System.out.println(number);
		double lSide = Math.floor(number)/1000;
		double rSide = number%1*1000;
		System.out.printf("%5.3f%n", rSide+lSide);
	}

}
