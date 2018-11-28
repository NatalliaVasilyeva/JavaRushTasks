package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Scanner(System.in).nextLine());
        }

        arrayList.remove(2);
        Collections.reverse(arrayList);

        for (String s:arrayList) {
            System.out.println(s);
        }
    }
}


