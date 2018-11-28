package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        
        int a =0, summ = 0;
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        while (a!=-1) {
            a = Integer.parseInt(rd.readLine());
            summ = summ+a;
        };
        System.out.println(summ);
    }
}
