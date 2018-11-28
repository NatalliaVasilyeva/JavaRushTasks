package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();

        if (60%x>=0&&60%x<=3) {
            System.out.println("зелёный");
            if (60%x>3&&60%x<=4) {
                System.out.println("желтый");}
                if (60%x>4&&60%x<=5) {
                    System.out.println("красный");}
            }
        }
    }
