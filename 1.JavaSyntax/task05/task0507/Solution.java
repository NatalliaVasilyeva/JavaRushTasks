package com.javarush.task.task05.task0507;
import java.util.Scanner;
/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {

            Scanner num = new Scanner(System.in);
            int a = 0;
            long result = 0;
            double i = 0;

            while (a != -1) {
                a = num.nextInt();
                if (a != -1) {
                    result = result + a;
                    i++;
                }
            }
            System.out.println(result/i);
        }
    }


