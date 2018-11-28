package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> x3 = new ArrayList<>();
        ArrayList<Integer> x2 = new ArrayList<>();
        ArrayList<Integer> other = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (Integer x : list) {
            if (x % 3 == 0) x3.add(x);
            if (x % 2 == 0) x2.add(x);
            if (x % 2 != 0 && x % 3 != 0) other.add(x);
        }
        printList(x3);
        printList(x2);
        printList(other);
    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
