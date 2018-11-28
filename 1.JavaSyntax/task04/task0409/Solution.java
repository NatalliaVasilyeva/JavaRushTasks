package com.javarush.task.task04.task0409;

/*
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {

        closeToTen(8, 11);   // вызываем метод для нахождения ближайшего к 10 числа
        closeToTen(14, 7);
    }

  public static void closeToTen(int a, int b) {

        int a1;
        int b1;

        a1 = 10 - a;    // Разница между 10 и введенным числом
        b1 = 10 - b;

        if ((abs(a1)) < (abs(b1))) {    //  если модуль 1-го числа полученного в abs меньше модуля 2-го числа, то a ближе к 10
            System.out.println(a);
        } else if ((abs(a1)) > (abs(b1))) {
            System.out.println(b);

        } else System.out.println(b);
    }

    public static int abs(int a) {  // Разница между 10 и введенным числом ПО МОДУЛЮ
        if (a<0){
            return -a;
        } else return a;
    }
}