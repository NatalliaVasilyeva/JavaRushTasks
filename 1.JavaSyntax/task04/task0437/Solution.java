package com.javarush.task.task04.task0437;


/* 
Треугольник из восьмерок
*/


public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int count = 9; //
        for (int i = 0; i < 10; i++) {
            for (int j = count; j < 10; j++) {
                System.out.print(8);
            }
            System.out.println();
            count--;

        }

    }
}
