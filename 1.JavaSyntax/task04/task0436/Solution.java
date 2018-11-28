package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int i;
        for (i = 1; i <= m; i++) {
            int j;
            for (j = 1; j <= n; j++)

                System.out.print(8);
            System.out.println();
        }

    }

}