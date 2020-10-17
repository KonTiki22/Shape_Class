package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Rectangle rect = new Rectangle(0,0,3,4);
        Rectangle_Kotlin rectKotlin = new Rectangle_Kotlin(0,0,3,4);
        System.out.println(rect.calcDiagonal());
        System.out.println(rect.calcArea());
        System.out.println(rectKotlin.calcDiagonal());
        System.out.println(rectKotlin.calcArea());


    }
}
