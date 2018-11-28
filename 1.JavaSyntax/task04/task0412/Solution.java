package com.javarush.task.task04.task0412;

import java.util.Scanner;
/*
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        if (x > 0){
            System.out.print (x * 2);
        }

        if (x < 0){
            System.out.print (x + 1);
        }
        if (x == 0){
            System.out.print (x);
        }
    }

}



