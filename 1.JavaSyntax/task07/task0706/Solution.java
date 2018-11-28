package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] house = new int[15];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0; i < house.length; i++){
            String s = reader.readLine();
            house[i] = Integer.parseInt(s);
            if (i % 2 == 0){
                sum1 += house[i];
            }
            else{
                sum2 += house[i];
            }
        }
        if (sum1 > sum2){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        else{
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}