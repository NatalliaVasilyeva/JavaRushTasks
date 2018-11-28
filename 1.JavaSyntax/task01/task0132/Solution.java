package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int x, y, z;
        x=number%10;
        y=(number/10)%10;
        z=(number/100)%10;
        
        int s = x+y+z;
        return s;
    }
}