package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
       String year = reader.readLine();
     //  int nYear = Integer.parseInt(year);
       String name = reader.readLine();
       
       System.out.println (name + " " + "захватит мир через" + " " + year +" " + "лет. Му-ха-ха!");
    }
}
