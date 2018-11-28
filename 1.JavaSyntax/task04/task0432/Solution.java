package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
       Scanner scan = new Scanner(System.in);
       String a= scan.nextLine();
int b= scan.nextInt();
int i=1;
while (i<=b) {
    System.out.println(a);
    i++;
}

    }
}
