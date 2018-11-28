package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Треугольник не существует.");
        } else {
            System.out.println("Треугольник существует.");

        }

    }


}