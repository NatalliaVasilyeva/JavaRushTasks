package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
       Scanner scan = new Scanner(System.in);
       int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a==b && b==c) {
            System.out.println(a +" " + b + " " + c);}
            if (a==b && a!=c){
                System.out.println(a +" " + b);   }
        if (a==c && a!=b){
            System.out.println(a +" " + c);   }
        if (c==b && c!=a){
            System.out.println(b +" " + c);   }
    }
    }
