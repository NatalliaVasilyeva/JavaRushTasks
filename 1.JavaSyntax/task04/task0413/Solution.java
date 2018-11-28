package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println("Imput manber");

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

       /* switch (x) {
            case 1:
                System.out.println("понедельник");
                break;
            case 2:
                System.out.println("вторник");
                break;
            case 3:
                System.out.println("среда");
                break;
            case 4:
                System.out.println("четверг");
                break;
            case 5:
                System.out.println("пятница");
                break;
            case 6:
                System.out.println("суббота");
                break;
            case 7:
                System.out.println("воскресение");
                break;
            default:
                System.out.println("такого дня недели не существует");
                break;*/
       if (x==1){
           System.out.println("понедельник");}
           if (x==2) {
               System.out.println("вторник");}
        if (x==3) {
            System.out.println("среда");}
        if (x==4) {
            System.out.println("четверг");}
        if (x==5) {
            System.out.println("пятница");}
        if (x==6) {
            System.out.println("суббота");}
        if (x==7) {
            System.out.println("воскресенье");}
        if (x<1||x>7) {
            System.out.println("такого дня недели не существует");}


        }
    }
