package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
В убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        
        int[] sortedArray = new int[array.length];
    Arrays.sort(array);

    for (int i = 0; i < array.length; i++) {
        sortedArray[i] = array[i];
    }

    for (int i = 0; i < sortedArray.length; i++) {
        array[i] = sortedArray[sortedArray.length - 1 - i];
    }

    }
}
