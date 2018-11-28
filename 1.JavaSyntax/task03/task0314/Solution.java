package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
         int i=1;
         while (i<=10) {
         for (int x=1; x<11; x++){
             int y = i*x;
             System.out.print(y + " ");
             
         }
         i++;
         System.out.println();
         }
         
         
         
    }
}
