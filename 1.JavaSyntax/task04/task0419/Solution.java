package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        int x = Max(a, b);
        int y = Max(c, d);
        System.out.println(Max(x, y));
    }
        public static int Max (int e, int f)    {
            if (e > f || e == f) {
                return e;
            } else {
                return f;
            }
        }

    }




