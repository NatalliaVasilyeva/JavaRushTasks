package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer maximum=null;

        int a;
        for(int n = Integer.parseInt(reader.readLine());n>0;n--){
            a = Integer.parseInt(reader.readLine());
            if(maximum==null)maximum=a;
            else if(a>maximum)maximum=a;
        }
        System.out.println(maximum);
      }
}
