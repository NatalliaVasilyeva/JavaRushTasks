
package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/*
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        int count = 1;
        int temp = 1;
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 1; i < list.size(); i++) {
            if (Integer.valueOf(list.get(i - 1)).equals(Integer.valueOf(list.get(i)))) {
                count++;
                if (count > temp) {
                    temp = count;
                }
            } else count = 1;
        }
        System.out.println(temp);
    }
}