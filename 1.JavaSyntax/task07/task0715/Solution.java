package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        
    ArrayList<String> word = new ArrayList<String>();
        Collections.addAll(word, "мама", "мыла", "раму");
        
     for(int i = 1; i <= word.size(); i=i+2){
            word.add(i, "именно");
        }
   
     for (String s : word) System.out.println(s);
   
    }
}
