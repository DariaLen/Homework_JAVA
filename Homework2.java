package org.telran.practika;

public class Homework2 {
    public static void main(String[] args) {
        int number = 456;

        int num1 = (number % 1000) / 100;
        int num2 = (number % 100) / 10;    //ili  int num2 = (number / 10) % 10;
        int num3 = number % 10;

        System.out.print(num1 + "," );
        System.out.print(num2 + "," );
        System.out.println(num3 + "," );
    }
}
