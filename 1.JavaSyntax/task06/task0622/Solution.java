package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;   
import java.util.Collections; 

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        
        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());
        int n3 = Integer.parseInt(reader.readLine());
        int n4 = Integer.parseInt(reader.readLine());
        int n5 = Integer.parseInt(reader.readLine());
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        list.add(n1);
        list.add(n2);
        list.add(n3);
        list.add(n4);
        list.add(n5);
        
        Collections.sort(list);
        
       for (int i = 0; i< list.size(); i++){
            System.out.println(list.get(i));
        }

        
        

        
    }
}
