package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br1.readLine());
        int b = Integer.parseInt(br1.readLine());
        int c = Integer.parseInt(br1.readLine());

        if (b == c && a != b)
            System.out.println("1");
        if (a == c && b!= a)
            System.out.println("2");
        if (a == b && b!=c)
            System.out.println("3");
        else
            System.out.print("");
    }
}
