package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        
         ArrayList<String> s = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int smollest = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            s.add(scanner.nextLine());
            int length = s.get(i).length();
            if (smollest > length) {
                smollest = length;
            }
        }
        for (String str : s) {
            if (str.length() == smollest)
                System.out.println(str);
        }
    }
}
