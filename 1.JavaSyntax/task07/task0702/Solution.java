package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String [] numList = new String [10];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < numList.length-2; i++) {
            numList[i] = bufferedReader.readLine();
        }
        int len = numList.length;
        String tempNum = null;
        for (int i = 0; i < len / 2; i++){
            tempNum = numList[i];
            numList[i] = numList[len - (i + 1)];
            numList[len - (i + 1)] = tempNum;
        }
        for (String i: numList){
            System.out.println(i);
        }
    }
}