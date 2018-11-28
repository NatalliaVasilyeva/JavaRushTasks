package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer[] grades = new Integer[3];
        int j=0;
        int k = 0;
        for (int i=0; i<grades.length; i++){
            grades[i]=Integer.parseInt(reader.readLine());
            if (grades[i]>0) j++;
            else if (grades[i]<0) k++;
        }

        System.out.println("количество отрицательных чисел: " +k);
        System.out.println("количество положительных чисел: " +j);

    }
}

