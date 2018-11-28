package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

    public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String snum = "";
        int amount = 0;
        while(true){
            snum = reader.readLine();
            if(!snum.equals("сумма")){
            int num = Integer.parseInt(snum);
            amount += num;}
            else break;
        }
        System.out.println(amount);
    }
}
