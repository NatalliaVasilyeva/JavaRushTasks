package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        double x=convertEurToUsd(5, 0.9);
        double y=convertEurToUsd(6, 0.7);
        System.out.println(x);
        System.out.println(y);
}
    public static double convertEurToUsd(int eur, double course) {
        double usd=eur*course;
        return usd;
    }
}
