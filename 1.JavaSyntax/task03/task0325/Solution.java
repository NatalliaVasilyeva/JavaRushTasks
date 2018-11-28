package com.javarush.task.task03.task0325;

import java.io.*;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        String zp = reader.readLine();
        int zp1 = Integer.parseInt(zp);
        
        System.out.println ("Я буду зарабатывать $"+zp+" в час ");
    }
}
