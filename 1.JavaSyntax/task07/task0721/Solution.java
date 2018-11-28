package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        //напишите тут ваш код
        
        int[] mass = new int[20];
        for(int i =0; i<mass.length; i++){
            mass[i] = Integer.parseInt(reader.readLine());
        }
        
        Arrays.sort(mass);
         maximum = mass[19];
         minimum = mass[0];       
        System.out.println(maximum+" "+minimum);
    }
}